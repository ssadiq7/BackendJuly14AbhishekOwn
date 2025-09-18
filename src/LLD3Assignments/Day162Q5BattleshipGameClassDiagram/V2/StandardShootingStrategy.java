package LLD3Assignments.Day162Q5BattleshipGameClassDiagram.V2;

public class StandardShootingStrategy implements ShootingStrategy {
    @Override
    public ShotType executeShot(Board targetBoard, Cell targetCell) {
        return targetBoard.getShot(targetCell);
    }
}
