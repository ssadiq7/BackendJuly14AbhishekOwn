package LLD3Assignments.Day162Q1SnakeAndLadderGameClassDiagram1.V1;

public abstract class BoardElement {
    protected Cell startCell;
    protected Cell endCell;

    public BoardElement(Cell startCell, Cell endCell) {
        this.startCell = startCell;
        this.endCell = endCell;
    }

    public abstract Cell getDestination();
}
