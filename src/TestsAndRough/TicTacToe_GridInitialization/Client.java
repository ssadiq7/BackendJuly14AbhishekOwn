package TestsAndRough.TicTacToe_GridInitialization;

import java.util.Random;
import java.util.Scanner;

public class Client {

    private static Scanner scanner = new Scanner(System.in);
    private static String input;

    public static void main(String[] args) {

        Game game = new Game();

        System.out.println("Starting Game: ");
        System.out.println("Enter the size of the board:");
        System.out.println("Example: 3 / 4 / 5 / 6\t\tNote: Default is 3");

        input = scanner.nextLine();

//        System.out.println("input => " + input);

        int n = Integer.parseInt(input);
//        System.out.println("number => " + n);

        game.initializeBoard(n);
        game.displayBoard();

        System.out.println("Enter the name and symbol for Player 1: Example: Robo X");
        input = scanner.nextLine();
//        System.out.println("input => " + input);

        // Split the input based on space
        String[] parts = input.split(" ");
        String player1Name = parts[0];
        String player1Symbol = parts[1];
//        System.out.println("Player 1 Name: " + player1Name);
//        System.out.println("Player 1 Symbol: " + player1Symbol);
        Player player1 = new Player(player1Name, new Symbol(player1Symbol), 1);
        game.addPlayer(player1);
        System.out.println("Player 1 added: " + player1.getName() + " with symbol " + player1.getSym().getSymbolName());

        System.out.println("Enter the name and symbol for Player 2: Example: Android O");
        input = scanner.nextLine();
        parts = input.split(" ");
        String player2Name = parts[0];
        String player2Symbol = parts[1];
        Player player2 = new Player(player2Name, new Symbol(player2Symbol), 2);
        game.addPlayer(player2);
        System.out.println("Player 2 added: " + player2.getName() + " with symbol " + player2.getSym().getSymbolName());

        System.out.println("Let the game begin!");
        game.setGameStatus(GameStatus.IN_PROGRESS);

        Random random = new Random();
        int currPlayerIndex = random.nextInt(2); // Generates 0 or 1
//        game.setCurrPlayerIndex(randomNumber);

        while(game.getGameStatus() == GameStatus.IN_PROGRESS) {

            game.displayBoard();

            Move move = game.makeMove(currPlayerIndex);

            if(move == null) {
                if(game.undoLastMove())
                    currPlayerIndex = game.switchPlayer(currPlayerIndex);
                continue;
            }

            try {
                game.validateMove(move);
            } catch (InvalidMoveException e) {
                System.out.println(e.getMessage() + "Try again!");
                continue; // Skip to the next iteration to let the same player try again
            }

            game.updateBoard(move);



            if(game.checkWinner(move)) {
                game.setGameStatus(GameStatus.WON);
                game.displayBoard();
                System.out.println("Player " + move.getPlayer().getName() + " has won the game!");
//                break;
            }

            if(game.isBoardFull()) {
                game.setGameStatus(GameStatus.DRAW);
                System.out.println("The game is a draw!");
                game.displayBoard();
//                break;
            }

//            game.displayBoard();
//            break; // Placeholder to avoid infinite loop in this example
            currPlayerIndex = game.switchPlayer(currPlayerIndex);

        }

    }

}
