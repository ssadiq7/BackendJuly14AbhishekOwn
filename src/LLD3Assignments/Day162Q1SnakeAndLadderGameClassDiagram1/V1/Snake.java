package LLD3Assignments.Day162Q1SnakeAndLadderGameClassDiagram1.V1;

public class Snake extends BoardElement {
    public Snake(Cell mouth, Cell tail) {
        super(mouth, tail);
    }

    @Override public Cell getDestination() {
        return endCell; // Moving down to tail
    }
}

// Snake and Ladder directly reference Cell objects rather than having a clearer relationship with the Board.
// The Player-Symbol relationship seems like unnecessary composition when a simple string attribute would suffice.
// To improve relationships, consider implementing inheritance for special cells.