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

    public int getRow() {
        return row;
    }

    public void setRow(int row) {
        this.row = row;
    }

    public int getCol() {
        return col;
    }

    public void setCol(int col) {
        this.col = col;
    }

    public Player getPlayer() {
        return player;
    }

    public void setPlayer(Player player) {
        this.player = player;
    }

    public CellType getCellType() {
        return cellType;
    }

    public void setCellType(CellType cellType) {
        this.cellType = cellType;
    }
}
