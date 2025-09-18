package LLD3Assignments.Day162Q5BattleshipGameClassDiagram.V2;

public interface Damageable { // Interface Segregation - Break down behaviors into interfaces
    boolean receiveHit(Cell cell);
    boolean isSunk();
}
