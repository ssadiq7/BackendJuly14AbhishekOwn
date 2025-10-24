package TestsAndRough.TicTacToe_GridInitialization.strategies;

import TestsAndRough.TicTacToe_GridInitialization.Board;
import TestsAndRough.TicTacToe_GridInitialization.Move;

import java.util.HashMap;
import java.util.Map;

public class RowWinningStrategy implements WinningStrategy {

    private Map<Integer, Map<String, Integer>> rowCounts = new HashMap<>();

    @Override
    public boolean checkWinner(Board board, Move move) {

        int row = move.getCell().getRow();
        String Symbol = move.getPlayer().getSym().getSymbolName();

        rowCounts.computeIfAbsent(row, k -> new HashMap<>());
        Map<String, Integer> symbolCountMap = rowCounts.get(row);
        symbolCountMap.put(Symbol, symbolCountMap.getOrDefault(Symbol, 0) + 1);
        return symbolCountMap.get(Symbol) == board.getSize();

    }
}
