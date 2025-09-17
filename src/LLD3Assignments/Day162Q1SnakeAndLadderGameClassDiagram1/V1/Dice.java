package LLD3Assignments.Day162Q1SnakeAndLadderGameClassDiagram1.V1;

public class Dice { // The Dice class is tightly coupled with the DiceNumber enum, making it difficult to introduce custom dice with different numbers of faces.
//    private DiceNumber diceNumber;

    private DiceRollStrategy rollStrategy;

    public Dice(DiceRollStrategy rollStrategy) {
        this.rollStrategy = rollStrategy;
    }

    public int roll() {
        return rollStrategy.rollDice();
    }
}
