package LLD3Assignments.Day162Q1SnakeAndLadderGameClassDiagram1.V1;

public interface MovementStrategy {
    Cell getNextPosition(Board board, Cell currentPosition, int diceValue);
}
