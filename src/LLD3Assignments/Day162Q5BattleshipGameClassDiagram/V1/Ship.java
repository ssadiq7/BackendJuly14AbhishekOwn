package LLD3Assignments.Day162Q5BattleshipGameClassDiagram.V1;

import java.util.List;

public abstract class Ship {
    private String name;
    private int size;
    private List<Cell> occupiedCells;

    public boolean isSunk() {
        return false;
    }

    public void occupyCells(List<Cell> cells) {

    }
}
