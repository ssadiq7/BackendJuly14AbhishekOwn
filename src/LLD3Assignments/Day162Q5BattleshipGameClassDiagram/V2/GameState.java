package LLD3Assignments.Day162Q5BattleshipGameClassDiagram.V2;

public interface GameState { // interface to facilitate different game modes (e.g., timed mode, salvo mode)
    void handleTurn(Player currentPlayer);
    boolean checkGameOver();
}
