package LLD3Assignments.Day162Q1SnakeAndLadderGameClassDiagram1.V1;

public class StandardDiceRoll implements DiceRollStrategy {
    @Override
    public int rollDice() {
        return (int)(Math.random() * 6) + 1;
    }
}
