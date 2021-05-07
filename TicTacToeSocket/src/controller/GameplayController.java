package controller;

import java.io.BufferedReader;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.Socket;
import model.Board;
import model.GameState;
import model.Symbol;
import view.*;

/**
 *
 */
public class GameplayController {

    private boolean isPlayingFirst;
    private boolean isMyTurn;
    private int myScore = 0;
    private int enemyScore = 0;
    private final Socket socket;
    private Board board = new Board();
    private final GameplayView view;
    SocketReader reader;
    DataOutputStream outSocket;

    public GameplayController(boolean isPlayingFirst, Socket socket) throws IOException {
        this.isPlayingFirst = this.isMyTurn = isPlayingFirst;
        this.socket = socket;

        reader = new SocketReader(socket);
        outSocket = new DataOutputStream(socket.getOutputStream());
        view = new GUIBoard(isPlayingFirst);
    }

    public void start() {
        new Thread(reader).start();
        view.start(this, board);
        view.setIsPlayingFirst(isPlayingFirst);
        view.setIsMyTurn(isMyTurn);
    }

    public boolean processMove(int row, int column) {
        if (isMyTurn) {
            if (board.isValidMove(row, column)) {
                board.setSymbol(row, column, isPlayingFirst ? Symbol.P1 : Symbol.P2);
                isMyTurn = false;
                view.setIsMyTurn(isMyTurn);
                view.drawBoard(board);
                writeToSocket(board);
                handleEndGame(board.evaluate());
            }
            return true;
        }
        return false;
    }

    private void writeToSocket(Object obj) {
        try {
            outSocket.writeBytes(obj.toString() + "\n");
        } catch (IOException e) {
            System.out.println("Cannot send data to socket");
            System.out.println(e.getMessage());
        }
    }

    public void stop() {
        System.out.println("controller stopping");
        writeToSocket("close");
        reader.stop();
    }

    private void shutdown() {
        System.out.println("controller shutting down");
        reader.stop();
        view.stop();
    }

    private void nextRound() {
        view.updateScore(myScore, enemyScore);
        isMyTurn = isPlayingFirst = !isPlayingFirst;
        board = new Board();
        view.setIsPlayingFirst(isPlayingFirst);
        view.setIsMyTurn(isMyTurn);
        view.drawBoard(board);
        view.drawBoardColor(new boolean[3][3]);
    }

    private void handleEndGame(GameState state) {
        switch (state) {
            case P1WIN:
                view.drawBoardColor(board.getColorArray());
                if (isPlayingFirst) {
                    myScore++;
                    view.showResult("You win");
                } else {
                    enemyScore++;
                    view.showResult("You lose");
                }
                nextRound();
                break;
            case P1LOSE:
                view.drawBoardColor(board.getColorArray());
                if (isPlayingFirst) {
                    enemyScore++;
                    view.showResult("You lose");
                } else {
                    myScore++;
                    view.showResult("You win");
                }
                nextRound();
                break;
            case DRAW:
                view.showResult("Draw");
                nextRound();
                break;
        }
    }

    private class SocketReader implements Runnable {

        private final BufferedReader inSocket;
        private final Socket socket;
        private volatile boolean isRunning = true;

        SocketReader(Socket socket) throws IOException {
            this.socket = socket;
            inSocket = new BufferedReader(new InputStreamReader(socket.getInputStream()));
        }

        @Override
        public void run() {
            while (isRunning) {
                try {
                    String reply = inSocket.readLine();

                    if (reply.equals("close")) {
                        shutdown();
                        stop();
                    } else {
                        board.parse(reply);
                        view.drawBoard(board);
                        handleEndGame(board.evaluate());
                        isMyTurn = true;
                        view.setIsMyTurn(isMyTurn);
                    }
                } catch (IOException e) {
                    stop();
                    System.out.println("Cannot read received data");
                    System.out.println(e.getMessage());
                }
            }
        }

        public void stop() {
            isRunning = false;
            try {
                socket.close();
            } catch (IOException e) {
                System.out.println("Unable to close socket");
                System.out.println(e.getMessage());
            }
        }
    }
}
