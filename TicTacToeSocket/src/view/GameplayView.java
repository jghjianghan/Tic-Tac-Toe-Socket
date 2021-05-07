package view;

import controller.GameplayController;
import model.Board;

/**
 * Interface untuk tampilan game
 */
public interface GameplayView {
    /**
     * Method untuk menampilkan papan tic tac toe pada pengguna
     * @param board data papan yang ingin digambar
     */
    public void drawBoard(Board board);
    
    public void drawBoardColor(boolean isColored[][]);
    
    /**
     * Method untuk menampilkan hasil permainan 
     * @param result Hasil permainan
     */
    public void showResult(String result);
    
    /**
     * Method untuk mengupdate skor pemail
     * @param selfScore Skor dari diri sendiri
     * @param enemyScore Skor lawan
     */
    public void updateScore(int selfScore, int enemyScore);
    
    public void setIsMyTurn(boolean isMyTurn);
    public void setIsPlayingFirst(boolean isPlayingFirst);
    
    /**
     * Method ini dipanggil ketika program ingin dimulai
     * @param controller
     * @param board
     */
    public void start(GameplayController controller, Board board);
    
    /**
     * Method ini dipanggil ketika program ingin dihentikan
     * View harus berhenti dan tertutup setelah method ini dipanggil.
     */
    public void stop();
}
