package LLD3Assignments.Day162Q5BattleshipGameClassDiagram.V2;

public class Game { // Dependency Inversion - Depend on abstractions
    private TurnStrategy turnStrategy;
    private WinningStrategy winningStrategy;

    public Game(TurnStrategy turnStrategy, WinningStrategy winningStrategy, Player player1, Player player2) {
        this.turnStrategy = turnStrategy;
        this.winningStrategy = winningStrategy;
        this.player1 = player1;
        this.player2 = player2;
    }

    public void takeTurns() {
        turnStrategy.executeTurn(currentPlayer);
    }

    public Player checkWinner() {
        return winningStrategy.determineWinner(player1, player2);
    }




    // Clarify the relationship between Game and Players

    // Composition relationship - Game owns and manages Players
    private final Player player1;
    private final Player player2;
    private Player currentPlayer;


    // Builder pattern implementation
    Game(GameBuilder builder) {
        this.player1 = builder.player1;
        this.player2 = builder.player2;
        this.currentPlayer = builder.startingPlayer;
    }




    public void startGame() {
        // Initialize players, boards, and ships
    }

    public void resetGame() {
        // Reset the game state for a new game
    }
}
