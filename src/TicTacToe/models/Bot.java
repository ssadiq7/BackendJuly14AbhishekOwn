package TicTacToe.models;


public class Bot extends Player
{
    private BotDifficultyLevel difficultyLevel;

    public Bot(int id, String name, Symbol symbol, PlayerType playerType, BotDifficultyLevel difficultyLevel) {
        super(id, name, symbol, playerType);
        this.difficultyLevel = difficultyLevel;
    }
}
