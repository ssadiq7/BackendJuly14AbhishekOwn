package TicTacToe.strategies;

import TicTacToe.models.*;

import java.util.List;

public class EasyDifficultStrategy implements BotDifficultStrategy
{
    @Override
    public Move makeMove(Board board, Player player)
    {
        for (List<Cell> rows : board.getGrid())
        {
            for (Cell cell : rows)
            {
                if (cell.getCellType().equals(CellType.EMPTY))
                {
                    return new Move(new Cell(cell.getRow(), cell.getCol()), player);
                }
            }
        }

        return null;
    }
}
