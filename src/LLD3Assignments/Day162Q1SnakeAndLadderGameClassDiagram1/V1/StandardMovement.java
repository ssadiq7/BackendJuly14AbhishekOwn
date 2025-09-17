package LLD3Assignments.Day162Q1SnakeAndLadderGameClassDiagram1.V1;

public class StandardMovement implements MovementStrategy {
    @Override
    public Cell getNextPosition(Board board, Cell currentPosition, int diceValue) {
        int newPosition = currentPosition.getPosition() + diceValue;
        Cell nextCell = board.getCellAtPosition(newPosition); // Check for snake or ladder
        return board.getDestinationCell(nextCell);
    }
}
