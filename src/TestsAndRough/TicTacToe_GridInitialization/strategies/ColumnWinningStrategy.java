package TestsAndRough.TicTacToe_GridInitialization.strategies;

import TestsAndRough.TicTacToe_GridInitialization.Board;
import TestsAndRough.TicTacToe_GridInitialization.Move;

import java.util.HashMap;
import java.util.Map;

public class ColumnWinningStrategy implements WinningStrategy {

    private final Map<Integer, Map<String, Integer>> colMap = new HashMap<>();

    @Override
    public boolean checkWinner(Board board, Move move) {

        int col = move.getCell().getCol();
        String Symbol = move.getPlayer().getSym().getSymbolName();

        colMap.computeIfAbsent(col, k -> new HashMap<>());
        Map<String, Integer> symbolCountMap = colMap.get(col); // Local variable for inner map
        symbolCountMap.put(Symbol, symbolCountMap.getOrDefault(Symbol, 0) + 1);
        return symbolCountMap.get(Symbol) == board.getSize();

    }

    @Override
    public void undoLastMove(Board board, Move move) {

        int col = move.getCell().getCol();
        String Symbol = move.getPlayer().getSym().getSymbolName();

        System.out.println("Current count: " + colMap.get(col).get(Symbol));

        colMap.get(col).put(Symbol, colMap.get(col).get(Symbol) - 1);

        System.out.println("Count after undo operation: " + colMap.get(col).get(Symbol));

    }
}
