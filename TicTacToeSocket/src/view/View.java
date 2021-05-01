package view;

import model.Board;
import model.GameResult;

/**
 *
 */
public interface View {
    public void drawBoard(Board board);
    public void showResult(String result);
    public void updateScore(int selfScore, int enemyScore);
}