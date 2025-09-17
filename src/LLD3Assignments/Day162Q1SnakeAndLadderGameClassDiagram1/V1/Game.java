package LLD3Assignments.Day162Q1SnakeAndLadderGameClassDiagram1.V1;

import java.util.List;

// The Game class has too many responsibilities (managing players, board, dice, moves) violating SRP.
// The Dependency Inversion Principle is not well-implemented as high-level modules directly depend on low-level modules.
// To improve SOLID adherence, consider: interface MovementStrategy

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
