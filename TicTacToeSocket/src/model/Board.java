/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

/**
 * Pemodelan dari papan tic tac toe
 */
public class Board {

    private final Symbol[][] board;

    public Board() {
        board = new Symbol[3][3];
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                board[i][j] = Symbol.EMPTY;
            }
        }
    }

    public void setSymbol(int row, int column, Symbol symbol) {
        board[row][column] = symbol;
    }

    public Symbol getSymbol(int row, int column) {
        return board[row][column];
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                switch (board[i][j]) {
                    case EMPTY:
                        sb.append(0);
                        break;
                    case P1:
                        sb.append(1);
                        break;
                    case P2:
                        sb.append(2);
                        break;
                }
            }
        }
        return sb.toString();
    }

    /**
     * Method that parses a string representation of a Tic-Tac-Toe board
     * into a Board object
     * @param str The string to parse. Should be exactly 9 characters long and only contains character '0', '1', or '2'
     */
    public void parse(String str) {
        if (str.length() != 9)
            throw new IllegalArgumentException("Argument is too short. Should be exactly 9 characters.");
        
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                switch (str.charAt(i * 3 + j)) {
                    case '0':
                        board[i][j] = Symbol.EMPTY;
                        break;
                    case '1':
                        board[i][j] = Symbol.P1;
                        break;
                    case '2':
                        board[i][j] = Symbol.P2;
                        break;
                    default:
                        throw new IllegalArgumentException("Unknown character '" + board[i][j] + "' at index " + (i*3+j));
                }
            }
        }
    }
    
    /**
     * Evaluates the state of the board
     * @return The result of the game
     */
    public GameState evaluate(){
        //Checks board in cardinal direction
        for (int i = 0; i < 3; i++) {
            //Horizontal
            if (board[i][0] == board[i][1] && board[i][1] == board[i][2]){
                if (board[i][0] == Symbol.P1){
                    return GameState.P1WIN;
                } else if (board[i][0] == Symbol.P2) {
                    return GameState.P1LOSE;
                }
            }
            
            //Vertical
            if (board[0][i] == board[1][i] && board[1][i] == board[2][i]){
                if (board[0][i] == Symbol.P1){
                    return GameState.P1WIN;
                } else if (board[0][1] == Symbol.P2) {
                    return GameState.P1LOSE;
                }
            }
        }
        
        //Check the diagonals
        if (board[0][0] == board[1][1] && board[1][1] == board[2][2]){
            if (board[1][1] == Symbol.P1){
                return GameState.P1WIN;
            } else if (board[1][1] == Symbol.P2) {
                return GameState.P1LOSE;
            }
        }
        if (board[0][2] == board[1][1] && board[1][1] == board[2][0]){
            if (board[1][1] == Symbol.P1){
                return GameState.P1WIN;
            } else if (board[1][1] == Symbol.P2) {
                return GameState.P1LOSE;
            }
        }
        
        boolean isBoardFull = true;
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (board[i][j] == Symbol.EMPTY){
                    isBoardFull = false;
                }
            }
        }
        return isBoardFull?GameState.DRAW:GameState.ONGOING;
    }
}
