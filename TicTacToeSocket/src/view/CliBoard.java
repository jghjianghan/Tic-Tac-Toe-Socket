package view;

import java.util.Scanner;
import java.util.StringTokenizer;
import model.Board;
import controller.GameplayController;

/**
 *
 */
public class CliBoard {
    private final Scanner sc = new Scanner(System.in);
    private final GameplayController controller;
    private boolean isRunning = true;
    
    public CliBoard(GameplayController controller, Board board) {
        this.controller = controller;
        System.out.println("Tic Tac Toe Game");
        drawBoard(board);
    }

//    @Override
    public void start(){
        while(true){
            System.out.println("Move: ");
            String tok = sc.nextLine();
            if (tok.equals("close")){
                break;
            } else {
                StringTokenizer tokenizer = new StringTokenizer(tok);
                int row = Integer.parseInt(tokenizer.nextToken()), col = Integer.parseInt(tokenizer.nextToken());
                System.out.println(controller.processMove(row, col));
            }
        }
    }
    
//    @Override
    public final void drawBoard(Board board) {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                switch(board.getSymbol(i, j)){
                    case EMPTY:
                        System.out.print(' ');
                        break;
                    case P1:
                        System.out.print('X');
                        break;
                    case P2:
                        System.out.print('O');
                        break;
                }
            }
            System.out.println();
        }
    }

//    @Override
    public void showResult(String result) {
        System.out.println(result);
    }

//    @Override
    public void updateScore(int selfScore, int enemyScore) {
        System.out.println("Score:");
        System.out.println("You\t: " + selfScore);
        System.out.println("Enemy\t: " + enemyScore);
    }    

//    @Override
    public void stop() {
        isRunning = false;
    }
}
