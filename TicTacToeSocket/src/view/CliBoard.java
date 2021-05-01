package view;

import model.Board;
import model.GameState;

/**
 *
 */
public class CliBoard implements View {

    @Override
    public void drawBoard(Board board) {
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

    @Override
    public void showResult(String result) {
        System.out.println(result);
    }

    @Override
    public void updateScore(int selfScore, int enemyScore) {
        System.out.println("Score:");
        System.out.println("You\t: " + selfScore);
        System.out.println("Enemy\t: " + enemyScore);
    }    
}
