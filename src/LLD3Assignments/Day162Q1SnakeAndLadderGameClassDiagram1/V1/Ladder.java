package LLD3Assignments.Day162Q1SnakeAndLadderGameClassDiagram1.V1;

//public class Ladder {
//    private Cell bottom;
//    private Cell top;
//}


public class Ladder extends BoardElement {
    public Ladder(Cell bottom, Cell top) {
        super(bottom, top);
    }

    @Override
    public Cell getDestination() {
        return endCell; // Climbing up to top
    }
}
