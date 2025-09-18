package LLD3Assignments.Day162Q5BattleshipGameClassDiagram.V2;

public interface ShotStrategy {
    ShotType executeShot(Board board, Cell cell);
}
