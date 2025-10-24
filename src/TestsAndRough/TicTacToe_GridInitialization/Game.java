package TestsAndRough.TicTacToe_GridInitialization;

import java.util.List;

public class Game {

    private Board board;
    private List<Player> players;
    private int currPlayerIndex;
    private int boardSize;

    public void initializeBoard(int n) {
        board = new Board(n);
    }

    public void displayBoard() {
        board.display();
    }

}
