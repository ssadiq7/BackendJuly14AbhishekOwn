package LLD3Assignments.Day162Q1SnakeAndLadderGameClassDiagram1.V1;

//public class Cell {
//    private int row;
//    private int col;
//    private Symbol symbol;
//}

public class Cell {
    private int position; // 1-100 position on board
    private CellType cellType; // Normal, Snake Head, Snake Tail, etc.
    // Other properties and methods


    public int getPosition() {
        return position;
    }
}