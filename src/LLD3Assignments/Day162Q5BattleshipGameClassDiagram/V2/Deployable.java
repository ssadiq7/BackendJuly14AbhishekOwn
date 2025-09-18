package LLD3Assignments.Day162Q5BattleshipGameClassDiagram.V2;

public interface Deployable { // Interface Segregation - Break down behaviors into interfaces
    boolean deploy(Board board, Cell startCell, PlacingType orientation);
}
