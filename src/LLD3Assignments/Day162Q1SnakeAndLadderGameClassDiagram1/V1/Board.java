package LLD3Assignments.Day162Q1SnakeAndLadderGameClassDiagram1.V1;

import java.util.ArrayList;
import java.util.List;

//public class Board {
//    private List<Cell> grid; // Snake and Ladder traditionally works with a 1D board of 100 cells
//    private List<Snake> snakes;
//    private List<Ladder> ladders;
//
//    public Cell getCellAtPosition(int newPosition) {
//        return null;
//    }
//
//    public Cell getDestinationCell(Cell nextCell) {
//        return null;
//    }
//}


public class Board {
    private List cells = new ArrayList<>(100);
/*
    public Board(List<Snake> snakes, List<Ladder> ladders) {
        // Initialize 100 normal cells
        for(int i = 1; i <= 100; i++) {
            cells.add(new NormalCell(i));
        }
        // Replace normal cells with special cells for snakes and ladders
        for(Snake snake : snakes) {
            int position = snake.getStartPosition();
            cells.set(position-1, new SnakeCell(position, snake.getEndPosition()));
        }
        for(Ladder ladder : ladders) {
            int position = ladder.getStartPosition();
            cells.set(position-1, new LadderCell(position, ladder.getEndPosition()));
        }
    }

    public Cell getCell(int position) {
        return cells.get(position-1);
    }*/
}
