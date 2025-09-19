package TicTacToe.client;

import TicTacToe.controllers.GameController;
import TicTacToe.models.Game;
import TicTacToe.models.GameState;

import java.util.Scanner;

public class GameClient
{
    private static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args)
    {
        GameController gameController = new GameController();

//        * 1. Start the game
        Game game = gameController.startGame();

//        * 2. Keep playing until GameState is IN_PROGRESS
        while (game.getGameState() == GameState.IN_PROGRESS)
        {
            gameController.makeMove(game);
            gameController.displayBoard(game);

            System.out.println("Do you want to undo the last move? [Y/N]");
            String input = scanner.nextLine();
            if(input.equalsIgnoreCase("Y"))
            {
                gameController.undo(game);
                System.out.println("Undo completed!");
                gameController.displayBoard(game);
            }
        }

//        * 3. Check winner and declare the result
        if (game.getGameState() == GameState.SUCCESS)
        {
            System.out.println("Game Over! The winner is: " + game.getWinner().getName());
        } else if (game.getGameState() == GameState.DRAW) {
            System.out.println("The game ended in a draw");
        }
        gameController.displayBoard(game);
    }
}
