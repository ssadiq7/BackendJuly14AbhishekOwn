package TestsAndRough.TicTacToe_GridInitialization;

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

        System.out.println("input => " + input);

        int n = Integer.parseInt(input);
        System.out.println("number => " + n);

        game.initializeBoard(n);
        game.displayBoard();



    }

}
