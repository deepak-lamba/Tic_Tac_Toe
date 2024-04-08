package TicTacToe;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.ArrayList;
import java.util.List;

public class Game {
     private static final Logger log = LogManager.getLogger(Game.class);
     private int boardSize;
     private int nextPlayerIndex=0;
     private GameStatus gameStatus;

     private List<Player> players = TicTacToe.players;

     private Board board;
    public Game(Board board) {
        this.board=board;
    }

    public void start() {
        log.debug("Debug message");
        log.info("Info message");
        log.warn("Warning message");
        log.error("Error message");
        log.fatal("Fatal message");
        gameStatus = GameStatus.Progress;
    }
    public Player getNextPlayer() {
        log.debug("Debug message");
        log.info("Info message");
        log.warn("Warning message");
        log.error("Error message");
        log.fatal("Fatal message");
        return players.get(nextPlayerIndex);
    }

    public GameStatus getStatus() {
        log.debug("Debug message");
        log.info("Info message");
        log.warn("Warning message");
        log.error("Error message");
        log.fatal("Fatal message");
        return gameStatus;
    }

    public void makeMove() {
        // Get the next player
        Player player = getNextPlayer();

        // Get the move from the player. You can use Scanner to get the input from the user//
        BoardCell boardcell = player.makeMove(board);

        // Validate if the cell is not empty
        // If not, throw a custom exception
        if (!board.isEmpty(boardcell.getRow(), boardcell.getColumn())) {
            throw new RuntimeException("Cell is not empty");
        }
        System.out.println("Move happened at row: " + boardcell.getRow() + " Column: " + boardcell.getColumn());
        board.setMove(boardcell);

        nextPlayerIndex = (nextPlayerIndex+1)%2;
        log.debug("Debug message");
        log.info("Info message");
        log.warn("Warning message");
        log.error("Error message");
        log.fatal("Fatal message");
    }

    public Board getBoard() {return board;}

}
