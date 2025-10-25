package TestsAndRough.TicTacToe_GridInitialization.strategies;

import TestsAndRough.TicTacToe_GridInitialization.Board;
import TestsAndRough.TicTacToe_GridInitialization.Move;

public interface WinningStrategy {

    boolean checkWinner(Board board, Move move);
    void undoLastMove(Board board, Move move);

}
