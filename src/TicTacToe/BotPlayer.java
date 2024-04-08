package TicTacToe;

import MoveStrategy.RandomMoveStrategy;
import MoveStrategy.MoveStrategy;

public class BotPlayer implements Player {

    private MoveStrategy moveStrategy;
    private Level level;
    private Symbol symbol;

    public BotPlayer(Level level, Symbol symbol) {
        this.level = level;
        this.symbol = symbol;
        if ((Level.EASY).equals(level)) {
            moveStrategy = new RandomMoveStrategy();
        } else {
            moveStrategy = new RandomMoveStrategy();
        }
    }

    @Override
    public Symbol getSymbol() {
        return symbol;
    }

    @Override
    public BoardCell makeMove(Board board) {
        BoardCell boardCell = moveStrategy.makeMove(board);
        boardCell.setSymbol(getSymbol());
        return boardCell;
    }

    @Override
    public Player get(int nextPlayerIndex) {
        return null;
    }
}
