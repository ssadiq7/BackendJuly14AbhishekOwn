package LLD3Assignments.Day162Q5BattleshipGameClassDiagram.V2;

public interface ShootingStrategy { // Interface for core behaviors
    ShotType executeShot(Board targetBoard, Cell targetCell);
}
