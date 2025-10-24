package TestsAndRough.TicTacToe_GridInitialization.strategies;

import TestsAndRough.TicTacToe_GridInitialization.Board;
import TestsAndRough.TicTacToe_GridInitialization.Move;

import java.util.HashMap;
import java.util.Map;

public class ColumnWinningStrategy implements WinningStrategy {

    private Map<Integer, Map<String, Integer>> columnCounts = new HashMap<>();

    @Override
    public boolean checkWinner(Board board, Move move) {

        int col = move.getCell().getCol();
        String Symbol = move.getPlayer().getSym().getSymbolName();

        columnCounts.computeIfAbsent(col, k -> new HashMap<>());
        Map<String, Integer> symbolCountMap = columnCounts.get(col);
        symbolCountMap.put(Symbol, symbolCountMap.getOrDefault(Symbol, 0) + 1);
        return symbolCountMap.get(Symbol) == board.getSize();

    }
}
