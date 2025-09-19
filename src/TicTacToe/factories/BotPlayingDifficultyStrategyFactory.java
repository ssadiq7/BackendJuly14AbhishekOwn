package TicTacToe.factories;

import TicTacToe.models.BotDifficultyLevel;
import TicTacToe.strategies.BotDifficultStrategy;
import TicTacToe.strategies.EasyDifficultStrategy;
import TicTacToe.strategies.HardDifficultStrategy;
import TicTacToe.strategies.MediumDifficultStrategy;

public class BotPlayingDifficultyStrategyFactory
{
    public static BotDifficultStrategy
    getBotDifficultStrategyByLevel(BotDifficultyLevel botDifficultyLevel)
    {
        BotDifficultStrategy botDifficultyStrategy;
        if(botDifficultyLevel == BotDifficultyLevel.EASY)
        {
            botDifficultyStrategy = new EasyDifficultStrategy();
        }else if (botDifficultyLevel == BotDifficultyLevel.MEDIUM)
        {
            botDifficultyStrategy = new MediumDifficultStrategy();
        } else if (botDifficultyLevel == BotDifficultyLevel.HARD) {
            botDifficultyStrategy = new HardDifficultStrategy();
        }else {
            throw new IllegalArgumentException("Invalid botDifficulty level");
        }

        return botDifficultyStrategy;
    }
}
