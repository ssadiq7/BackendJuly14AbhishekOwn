package TicTacToe.models;

import TicTacToe.strategies.WinningStrategy;

import java.util.ArrayList;
import java.util.List;

public class Game
{
    private Board board;
    private List<Player> players;
    private int nextPlayerIndex;
    private GameState gameState;
    private List<Move> moves;
    private Player winner;
    private List<WinningStrategy> winningStrategies;

    public Game(int size, List<Player> players, List<WinningStrategy> winningStrategies)
    {
        this.board = new Board(size);
        this.players = players;
        this.winningStrategies = winningStrategies;
        this.nextPlayerIndex = 0;
        this.gameState = GameState.IN_PROGRESS;
        this.moves = new ArrayList<>();
        this.winner = null;
    }

    public GameState getGameState() {
        return gameState;
    }

    public List<Player> getPlayers() {
        return players;
    }

    public List<Move> getMoves() {
        return moves;
    }

    public List<WinningStrategy> getWinningStrategies() {
        return winningStrategies;
    }

    public Board getBoard() {
        return board;
    }

    public Player getWinner() {
        return winner;
    }

    private void validate(Move move)
    {
        int row = move.getCell().getRow();
        int col = move.getCell().getCol();

        if (row < 0 || row >= board.getSize() || col < 0 || col >= board.getSize())
        {
            throw new RuntimeException("Invalid move");
        }

        if(board.getCell(row, col).getCellType().equals(CellType.FILLED))
        {
            throw new RuntimeException("Invalid move. Cell is already filled");
        }
    }

    private void updateGame(Move move, Player currentPlayer)
    {
        int row = move.getCell().getRow();
        int col = move.getCell().getCol();

        Cell actualCell = board.getCell(row, col);
        actualCell.setCellType(CellType.FILLED);
        actualCell.setPlayer(currentPlayer);

        nextPlayerIndex++;
        nextPlayerIndex %= players.size();

        move.setCell(actualCell);
        moves.add(move);
    }

    private boolean checkWinner(Move move)
    {
        for (WinningStrategy winningStrategy : winningStrategies)
        {
            if (winningStrategy.checkWinner(board, move))
            {
                return true;
            }
        }

        return false;
    }

    private boolean checkDraw()
    {
        return moves.size() == board.getSize() * board.getSize();
    }

    public void makeMove()
    {
        // 1. Figure out who the current player is
        Player currentPlayer = players.get(nextPlayerIndex);
        Move move = currentPlayer.makeMove(board);

        // 2. Validate the move player makes
        try
        {
            validate(move);
        }catch (Exception e)
        {
            System.out.println(e.getMessage() + ". Please try again.");
            return;
        }

        // 3. Update the game
        updateGame(move, currentPlayer);

        // 4. Check winner/draw
        if (checkWinner(move))
        {
            gameState = GameState.SUCCESS;
            winner = currentPlayer;
        }else if (checkDraw())
        {
            gameState = GameState.DRAW;
        }
    }
}
