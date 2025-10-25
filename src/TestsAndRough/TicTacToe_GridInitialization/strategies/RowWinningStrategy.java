package TestsAndRough.TicTacToe_GridInitialization.strategies;

import TestsAndRough.TicTacToe_GridInitialization.Board;
import TestsAndRough.TicTacToe_GridInitialization.Move;

import java.util.HashMap;
import java.util.Map;

public class RowWinningStrategy implements WinningStrategy {

    private final Map<Integer, Map<String, Integer>> rowMap = new HashMap<>();

    @Override
    public boolean checkWinner(Board board, Move move) {

        int row = move.getCell().getRow();
        String Symbol = move.getPlayer().getSym().getSymbolName();

        if(!rowMap.containsKey(row)) {
            rowMap.put(row, new HashMap<>());
        }
        if(!rowMap.get(row).containsKey(Symbol)) {
            rowMap.get(row).put(Symbol, 0);
        }
        rowMap.get(row).put(Symbol, rowMap.get(row).get(Symbol) + 1);

        return rowMap.get(row).get(Symbol) == board.getSize();

//        rowCounts.computeIfAbsent(row, k -> new HashMap<>());
//        Map<String, Integer> symbolCountMap = rowCounts.get(row);
//        symbolCountMap.put(Symbol, symbolCountMap.getOrDefault(Symbol, 0) + 1);
//        return symbolCountMap.get(Symbol) == board.getSize();

    }

    @Override
    public void undoLastMove(Board board, Move move) {

        int row = move.getCell().getRow();
        String Symbol = move.getPlayer().getSym().getSymbolName();

        System.out.println("Current count: " + rowMap.get(row).get(Symbol));

        rowMap.get(row).put(Symbol, rowMap.get(row).get(Symbol) - 1);

        System.out.println("Count after undo operation: " + rowMap.get(row).get(Symbol));

    }
}
