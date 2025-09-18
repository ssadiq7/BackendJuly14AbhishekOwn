package LLD3Assignments.Day162Q5BattleshipGameClassDiagram.V2;

public class StandardShotStrategy implements ShotStrategy {
    @Override public ShotType executeShot(Board board, Cell cell) {
        return board.getShot(cell);
    }
}