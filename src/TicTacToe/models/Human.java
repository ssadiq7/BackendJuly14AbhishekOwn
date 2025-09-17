package TicTacToe.models;

public class Human extends Player
{
    private int level;
    private int coins;

    public Human(int id, String name, Symbol symbol, PlayerType playerType)
    {
        super(id, name, symbol, playerType);
        this.level = 1;
        this.coins = 50;
    }
}
