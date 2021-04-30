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
    public Board(){
        board = new Symbol[3][3];
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                board[i][j] = Symbol.EMPTY;
            }
        }
    }
    
    public void setSymbol(int row, int column, Symbol symbol){
        board[row][column] = symbol;
    }
    
    public Symbol getSymbol(int row, int column){
        return board[row][column];
    }
}
