package LLD3Assignments.Day162Q1SnakeAndLadderGameClassDiagram1.V0;

import java.util.List;

public class Game {
    private Board board;
    private List<Player> players;
    private Dice dice;
    private int nextPlayerIndex;
    private GameState gameState;
    private Player winner;
    private WinningStrategy winningStrategy;
    private List<Move> moves;

    public int makeMove(Player player) {
        return 0;
    };

}
