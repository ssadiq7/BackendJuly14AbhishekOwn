package TestsAndRough.TicTacToe_GridInitialization;

import java.util.ArrayList;
import java.util.List;

public class Board {

    private List<List<Cell>> grid;

    public Board(int n) {

        grid = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            grid.add(new ArrayList<>());
            for (int j = 0; j < n; j++) {
                grid.get(i).add(new Cell(i, j));
            }
        }

    }

    public List<List<Cell>> getGrid() {
        return grid;
    }

    public void setGrid(List<List<Cell>> grid) {
        this.grid = grid;
    }

    public void display() {
        String mark;
        for (int i = 0; i < grid.size(); i++) {
            for (int j = 0; j < grid.get(i).size(); j++) {
                if(grid.get(i).get(j).getPlayer() == null) {
//                    mark = "-";
                    mark = i + "," + j;
                    System.out.print("|"+mark+"|");
                }
                else {
                    mark = grid.get(i).get(j).getPlayer().getSym().getSymbolName();
                    System.out.print("| "+mark+" |");
                }
//                System.out.print("| "+mark+" |");
            }
            System.out.println();
        }
    }



}
