package TicTacToe.client;

import TicTacToe.controllers.GameController;
import TicTacToe.models.Game;
import TicTacToe.models.GameState;

public class GameClient
{
    public static void main(String[] args)
    {
        GameController gameController = new GameController();

//        * 1. Start the game
        Game game = gameController.startGame();
        gameController.displayBoard(game);
//        * 2. Keep playing until GameState is IN_PROGRESS
        while (game.getGameState() == GameState.INIT)
        {
//        *   i. Display the board
            gameController.displayBoard(game);

//        *   ii. Make move
            gameController.makeMove();
        }
//        * 3. Check winner and declare the result
    }
}
