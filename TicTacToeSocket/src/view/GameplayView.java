package view;

import model.Board;

/**
 *
 */
public interface GameplayView {
    public void drawBoard(Board board);
    public void showResult(String result);
    public void updateScore(int selfScore, int enemyScore);
    public void start();
    public void stop();
}
