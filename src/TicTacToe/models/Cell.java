package TicTacToe.models;

public class Cell
{
    private int row;
    private int col;
    private Player player;
    private CellType cellType;

    public Cell(int row, int col)
    {
        this.row = row;
        this.col = col;
        this.player = null;
        this.cellType = CellType.EMPTY;
    }
}
