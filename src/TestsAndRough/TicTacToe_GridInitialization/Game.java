package TestsAndRough.TicTacToe_GridInitialization;

import java.util.List;
import java.util.ArrayList;
import java.util.Scanner;

public class Game {

    private Board board;
    private List<Player> players;
    private int currPlayerIndex;
    private int boardSize;
    private List<Move> moves;
    private GameStatus gameStatus;

    public void initializeBoard(int n) {
        board = new Board(n);
    }

    public void displayBoard() {
        board.display();
    }

    public void addPlayer(Player player) {
        if(this.players == null) {
            this.players = new ArrayList<>();
        }
        players.add(player);
    }

    public Board getBoard() {
        return board;
    }

    public void setBoard(Board board) {
        this.board = board;
    }

    public List<Player> getPlayers() {
        return players;
    }

    public void setPlayers(List<Player> players) {
        this.players = players;
    }

    public int getCurrPlayerIndex() {
        return currPlayerIndex;
    }

    public void setCurrPlayerIndex(int currPlayerIndex) {
        this.currPlayerIndex = currPlayerIndex;
    }

    public int getBoardSize() {
        return boardSize;
    }

    public void setBoardSize(int boardSize) {
        this.boardSize = boardSize;
    }

    public List<Move> getMoves() {
        return moves;
    }

    public void setMoves(List<Move> moves) {
        this.moves = moves;
    }

    public GameStatus getGameStatus() {
        return gameStatus;
    }

    public void setGameStatus(GameStatus gameStatus) {
        this.gameStatus = gameStatus;
    }

    public Move makeMove(int currPlayerIndex) {

        Player currentPlayer = players.get(currPlayerIndex);

        return currentPlayer.makeMove(board);

    }

    public void validateMove(Move move) {

        int row = move.getCell().getRow();
        int col = move.getCell().getCol();

        // Validate row and col within bounds
        if(row < 0 || row >= board.getGrid().size() || col < 0 || col >= board.getGrid().size()) {
            throw new InvalidMoveException("Move is out of bounds. Please choose a valid cell.");
        }

        // Validate cell is unoccupied
        if(board.getGrid().get(row).get(col).getCellType().equals(CellType.OCCUPIED)) {
            throw new InvalidMoveException("Cell is already occupied. Choose another cell.");
        }

    }

    public int switchPlayer() {
        currPlayerIndex = (currPlayerIndex + 1) % players.size();
        return currPlayerIndex;
    }

    public void updateBoard(Move move) {
        int row = move.getCell().getRow();
        int col = move.getCell().getCol();
        Symbol symbol = move.getPlayer().getSym();

        board.getGrid().get(row).get(col).setCellType(CellType.OCCUPIED);
        board.getGrid().get(row).get(col).setPlayer(move.getPlayer());
    }

}
