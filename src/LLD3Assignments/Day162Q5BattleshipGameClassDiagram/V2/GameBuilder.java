package LLD3Assignments.Day162Q5BattleshipGameClassDiagram.V2;

public class GameBuilder {
    Player player1;
    Player player2;
    Player startingPlayer;

    public GameBuilder withPlayer1(Player player1) {
        this.player1 = player1;
        return this;
    }

    public GameBuilder withPlayer2(Player player2) {
        this.player2 = player2;
        return this;
    }

    public GameBuilder startingWith(Player player) {
        this.startingPlayer = player;
        return this;
    }

    public Game build() {
        return new Game(this);
    }
}
