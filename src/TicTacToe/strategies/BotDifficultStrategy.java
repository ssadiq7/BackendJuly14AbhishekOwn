package TicTacToe.strategies;

import TicTacToe.models.Board;
import TicTacToe.models.Move;
import TicTacToe.models.Player;

public interface BotDifficultStrategy
{
    Move makeMove(Board board, Player player);
}
