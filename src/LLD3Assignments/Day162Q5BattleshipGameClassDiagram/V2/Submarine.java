package LLD3Assignments.Day162Q5BattleshipGameClassDiagram.V2;

public class Submarine extends Ship {
    @Override
    public boolean receiveHit(Cell cell) {
        return false;
    }

    @Override
    public boolean deploy(Board board, Cell startCell, PlacingType orientation) {
        return false;
    }
}
