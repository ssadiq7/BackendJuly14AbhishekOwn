package TicTacToe.models;

import java.util.ArrayList;
import java.util.List;

public class Board
{
    private int size;
    private List<List<Cell>> grid;

    public Board(int size)
    {
        this.size = size;
        grid = new ArrayList<>();
        for (int i = 0; i < size; i++)
        {
            grid.add(new ArrayList<>());
            for (int j = 0; j < size; j++)
            {
                grid.get(i).add(new Cell(i, j));
            }
        }
    }

    public void display()
    {
        for (int i = 0; i < size; i++)
        {
            for (int j = 0; j < size; j++)
            {
                grid.get(i).get(j).display();
            }
            System.out.println();
        }
    }

    public int getSize() {
        return size;
    }

    public List<List<Cell>> getGrid() {
        return grid;
    }

    public Cell getCell(int row, int col)
    {
        return grid.get(row).get(col);
    }
}
