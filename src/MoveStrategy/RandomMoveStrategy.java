package MoveStrategy;

import TicTacToe.Board;
import TicTacToe.BoardCell;

public class RandomMoveStrategy implements MoveStrategy{
    public BoardCell makeMove(Board board) {
        // Get the available cells
        for(int i=0; i<board.cells.size(); i++){
            for(int j=0; j<board.cells.get(0).size(); j++){
                if(board.cells.get(i).get(j).getSymbol() == null){
                    return new BoardCell(i, j, null);
                }
            }
        }
        return null;
    }
}
