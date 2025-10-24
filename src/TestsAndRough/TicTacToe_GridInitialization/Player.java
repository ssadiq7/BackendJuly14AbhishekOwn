package TestsAndRough.TicTacToe_GridInitialization;

import java.util.Scanner;

public class Player {

    private String name;
    private Symbol sym;
    private int playerNumber;

    public Player(String name, Symbol sym, int playerNumber) {
        this.name = name;
        this.sym = sym;
        this.playerNumber = playerNumber;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Symbol getSym() {
        return sym;
    }

    public void setSym(Symbol sym) {
        this.sym = sym;
    }

    public Move makeMove(Board board) {

        System.out.println(this.getName() + ", it is your turn, make your move.");
        System.out.println("Enter the row and column to place your symbol (0-indexed), separated by comma ',' :");
        Scanner scanner = new Scanner(System.in);
        String rowAndCol = scanner.nextLine();
        String[] parts = rowAndCol.split(",");
        int row = Integer.parseInt(parts[0]);
        int col = Integer.parseInt(parts[1]);

        System.out.println("row: " + row);
        System.out.println("col: " + col);

        return new Move(new Cell(row, col), this);

    }

}
