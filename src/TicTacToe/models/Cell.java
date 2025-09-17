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

    public void display()
    {
        if(cellType.equals(CellType.EMPTY))
        {
            System.out.print("|-|");
        }else
        {
            System.out.print("|" + player.getSymbol().getSym() + "|");
        }
    }
}
