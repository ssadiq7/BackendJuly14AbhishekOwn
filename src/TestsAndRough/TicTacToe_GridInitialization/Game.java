package TestsAndRough.TicTacToe_GridInitialization;

import TestsAndRough.TicTacToe_GridInitialization.strategies.*;

import java.util.List;
import java.util.ArrayList;

public class Game {

    private Board board;
    private List<Player> players;
    private int currPlayerIndex;
//    private int boardSize;
    private List<Move> moves;
    private GameStatus gameStatus;

    private WinningStrategy rowWinningStrategy;
    private WinningStrategy columnWinningStrategy;
    private WinningStrategy leftDiagonalWinningStrategy;
    private WinningStrategy rightDiagonalWinningStrategy;

    public void initializeBoard(int n) {
        board = new Board(n);
        moves = new ArrayList<>();

        rowWinningStrategy = new RowWinningStrategy();
        columnWinningStrategy = new ColumnWinningStrategy();
        leftDiagonalWinningStrategy = new LeftDiagonalWinningStrategy();
        rightDiagonalWinningStrategy = new RightDiagonalWinningStrategy();
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

//    public int getBoardSize() {
//        return boardSize;
//    }

//    public void setBoardSize(int boardSize) {
//        this.boardSize = boardSize;
//    }

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

        Move move = currentPlayer.makeMove(board);

        if(move == null) {
            return null;
        }

        return move;

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

    public int switchPlayer(int currPlayerIndex) {
//        currPlayerIndex = (currPlayerIndex + 1) % players.size();
        if(currPlayerIndex == 0)
            return 1;
        if(currPlayerIndex == 1)
            return 0;

        return -1;
    }

    public void updateBoard(Move move) {
        int row = move.getCell().getRow();
        int col = move.getCell().getCol();
        Symbol symbol = move.getPlayer().getSym();

        board.getGrid().get(row).get(col).setCellType(CellType.OCCUPIED);
        board.getGrid().get(row).get(col).setPlayer(move.getPlayer());

        // Add this move to the list of moves
        moves.add(move);
    }

    public boolean checkWinner(Move move) {

//        WinningStrategy rowWinningStrategy = new RowWinningStrategy();
//        WinningStrategy columnWinningStrategy = new ColumnWinningStrategy();
//        WinningStrategy diagonalWinningStrategy = new LeftDiagonalWinningStrategy();

//        if(rowWinningStrategy.checkWinner(board, move) || columnWinningStrategy.checkWinner(board, move)
//                || leftDiagonalWinningStrategy.checkWinner(board, move) || rightDiagonalWinningStrategy.checkWinner(board, move)) {
//            this.gameStatus = GameStatus.WON;
////            System.out.println("Player " + move.getPlayer().getName() + " has won the game!");
//            return true;
//        }
        if(rowWinningStrategy.checkWinner(board, move)) {
            System.out.println(move.getPlayer().getName() + " won by marking '" + move.getPlayer().getSym().getSymbolName() + "' in a row!");
            return true;
        } else if(columnWinningStrategy.checkWinner(board, move)) {
            System.out.println(move.getPlayer().getName() + " won by marking '" + move.getPlayer().getSym().getSymbolName() + "' in a column!");
            return true;
        } else if(leftDiagonalWinningStrategy.checkWinner(board, move)) {
            System.out.println(move.getPlayer().getName() + " won by marking '" + move.getPlayer().getSym().getSymbolName() + "' in the left diagonal!");
            return true;
        } else if(rightDiagonalWinningStrategy.checkWinner(board, move)) {
            System.out.println(move.getPlayer().getName() + " won by marking '" + move.getPlayer().getSym().getSymbolName() + "' in the right diagonal!");
            return true;
        }

        return false;

    }

    public boolean isBoardFull() {
//        for (int i = 0; i < board.getSize(); i++) {
//            for (int j = 0; j < board.getSize(); j++) {
//                if (board.getGrid().get(i).get(j).getCellType().equals(CellType.EMPTY)) {
//                    return false;
//                }
//            }
//        }
//        return true;
        return moves.size() == board.getSize() * board.getSize();
    }

    public boolean undoLastMove() {
        if(moves.isEmpty()) {
            System.out.println("There are no move to undo.");
            return false;
        }
        Move move = moves.getLast();

        board.getGrid().get(move.getCell().getRow()).get(move.getCell().getCol()).setPlayer(null);
        board.getGrid().get(move.getCell().getRow()).get(move.getCell().getCol()).setCellType(CellType.EMPTY);
        moves.remove(move);

        // Propagate the changes to HashMaps of the Strategies as well
        rowWinningStrategy.undoLastMove(board, move);
        columnWinningStrategy.undoLastMove(board, move);
        leftDiagonalWinningStrategy.undoLastMove(board, move);
        rightDiagonalWinningStrategy.undoLastMove(board, move);

        return true;

    }

}
