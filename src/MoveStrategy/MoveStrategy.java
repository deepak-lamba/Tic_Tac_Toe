package MoveStrategy;

import TicTacToe.Board;
import TicTacToe.BoardCell;

public interface MoveStrategy {
    public BoardCell makeMove(Board board);
}
