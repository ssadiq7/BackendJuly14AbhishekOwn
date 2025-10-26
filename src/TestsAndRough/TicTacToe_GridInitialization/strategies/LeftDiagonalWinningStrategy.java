package TestsAndRough.TicTacToe_GridInitialization.strategies;

import TestsAndRough.TicTacToe_GridInitialization.Board;
import TestsAndRough.TicTacToe_GridInitialization.Move;

import java.util.HashMap;
import java.util.Map;

public class LeftDiagonalWinningStrategy implements WinningStrategy {

    Map<String, Integer> playerMovesCount = new HashMap<>();

    @Override
    public boolean checkWinner(Board board, Move move) {

        int row = move.getCell().getRow();
        int col = move.getCell().getCol();
        String playerSymbol = move.getPlayer().getSym().getSymbolName();

        // Check if the move is on the left diagonal
        if (row == col) {
            int count = playerMovesCount.getOrDefault(playerSymbol, 0);
            count++;
            playerMovesCount.put(playerSymbol, count);

            // If the count of moves on the left diagonal equals the board size, we have a winner
            return count == board.getSize();
        }

        return false;

    }

    @Override
    public void undoLastMove(Board board, Move move) {

        int row = move.getCell().getRow();
        int col = move.getCell().getCol();
        String Symbol = move.getPlayer().getSym().getSymbolName();

        if(row == col) {
            System.out.println("Current count: " + playerMovesCount.get(Symbol));
            playerMovesCount.put(Symbol, playerMovesCount.get(Symbol) - 1);
            System.out.println("Count after undo operation: " + playerMovesCount.get(Symbol));
        }

    }
}
