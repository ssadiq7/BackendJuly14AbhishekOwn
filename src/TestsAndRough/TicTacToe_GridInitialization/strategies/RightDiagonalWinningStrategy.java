package TestsAndRough.TicTacToe_GridInitialization.strategies;

import TestsAndRough.TicTacToe_GridInitialization.Board;
import TestsAndRough.TicTacToe_GridInitialization.Move;

import java.util.HashMap;
import java.util.Map;

public class RightDiagonalWinningStrategy implements WinningStrategy {

    private Map<String, Integer> playerMovesCount = new HashMap<>();

    @Override
    public boolean checkWinner(Board board, Move move) {

        int row = move.getCell().getRow();
        int col = move.getCell().getCol();
        String playerSymbol = move.getPlayer().getSym().getSymbolName();

        // Check if the move is on the right diagonal
        if (col == (board.getSize() - row - 1)) {
            int count = playerMovesCount.getOrDefault(playerSymbol, 0);
            count++;
            playerMovesCount.put(playerSymbol, count);

            // If the count of moves on the right diagonal equals the board size, we have a winner
            return count == board.getSize();
        }

        return false;

    }

    @Override
    public void undoLastMove(Board board, Move move) {

    }
}
