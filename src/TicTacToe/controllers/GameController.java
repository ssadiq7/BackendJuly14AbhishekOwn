package TicTacToe.controllers;

import TicTacToe.models.*;
import TicTacToe.strategies.RowWinningStrategy;
import TicTacToe.strategies.WinningStrategy;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class GameController
{
    Scanner scanner = new Scanner(System.in);
    public Game startGame()
    {
        // 1. Ask for the size of the board
        int size = getBoardSize();

        // 2. Ask for the list of players
        List<Player> players = getPlayerList(size);

        // 3. Ask for the winning strategies: TODO
        List<WinningStrategy> winningStrategies = new ArrayList<>();
        winningStrategies.add(new RowWinningStrategy());

        return new Game(size, players, winningStrategies);
    }

    public int getBoardSize()
    {
        System.out.println("Please input the size of the board");
        int size = scanner.nextInt();
        scanner.nextLine(); /* Mitigate the ArrayIndexOutOfBound Exception from scanner for taking name and symbol together*/
        return size;
    }

    public List<Player> getPlayerList(int size)
    {
        System.out.println("Let's add the players to the board");
        List<Player> playerList = new ArrayList<>();

        System.out.println("Do you want a bot? [Y/N]");
        int currentSizeOfPlayers = size - 1;
        String input = scanner.nextLine();
        if(input.equalsIgnoreCase("Y"))
        {
            Player player = new Bot(-1, "Boltu", new Symbol("B"), PlayerType.BOT, BotDifficultyLevel.EASY);
            playerList.add(player);
            currentSizeOfPlayers--;
        }

        System.out.println("Please enter the player details");
        for (int i = 0; i < currentSizeOfPlayers; i++)
        {
            System.out.println("Player detail format: name symbol");
            String[] details = scanner.nextLine().split(" ");
            Player player = new Human(i, details[0], new Symbol(details[1]), PlayerType.HUMAN);
            playerList.add(player);
        }

        return playerList;
    }

//    Game -> Board -> Cell
    public void displayBoard(Game game)
    {
        game.getBoard().display();
    }

    public void makeMove(Game game)
    {
        game.makeMove();
    }
}
