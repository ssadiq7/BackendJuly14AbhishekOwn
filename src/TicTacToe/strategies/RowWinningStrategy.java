package TicTacToe.strategies;

import TicTacToe.models.Board;
import TicTacToe.models.Move;
import TicTacToe.models.Symbol;

import java.util.HashMap;

public class RowWinningStrategy implements WinningStrategy
{
    HashMap<Integer, HashMap<String, Integer>> rowMap = new HashMap<>();
    @Override
    public boolean checkWinner(Board board, Move move)
    {
        int row = move.getCell().getRow();
        String symbol = move.getPlayer().getSymbol().getSym();

        if(!rowMap.containsKey(row))
        {
            rowMap.put(row, new HashMap<>());
        }

        if(!rowMap.get(row).containsKey(symbol))
        {
            rowMap.get(row).put(symbol, 0);
        }

        rowMap.get(row).put(symbol, rowMap.get(row).get(symbol) + 1);

        return rowMap.get(row).get(symbol)  == board.getSize();
    }

    @Override
    public void handleUndo(Move move) {
        int row = move.getCell().getRow();
        String symbol = move.getPlayer().getSymbol().getSym();

        rowMap.get(row).put(symbol, rowMap.get(row).get(symbol) - 1);
    }
}

/*
{1:{"X": 1}}
* {
* 0 : {"X": 0, "O": 0},
* 1: {"X": 0, "O": 0},
* 2: {"X": 0, "O": 0}
* }
*
* */
