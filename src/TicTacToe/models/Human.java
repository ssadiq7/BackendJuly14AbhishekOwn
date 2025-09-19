package TicTacToe.models;

import java.util.Scanner;

public class Human extends Player
{
    private int level;
    private int coins;
    private Scanner scanner;

    public Human(int id, String name, Symbol symbol, PlayerType playerType)
    {
        super(id, name, symbol, playerType);
        this.level = 1;
        this.coins = 50;
        this.scanner = new Scanner(System.in);
    }

    @Override
    public Move makeMove(Board board)
    {
        System.out.println("Hey, " + this.getName() +  ", it's your turn!");
        System.out.println("Please enter the index of the row: ");
        int row = scanner.nextInt();
        System.out.println("Please enter the index of the column: ");
        int column = scanner.nextInt();

        return new Move(new Cell(row, column), this);
    }
}
