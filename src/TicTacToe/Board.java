package TicTacToe;

import java.util.ArrayList;
import java.util.List;

public class Board {
    private int BOARD_SIZE=TicTacToe.BOARD_SIZE;
    public List<List<BoardCell>> cells = new ArrayList<>();

    public Board() {
        for(int i=0; i<BOARD_SIZE; i++){
            List<BoardCell> boardList=new ArrayList<>();
            for(int j=0; j<BOARD_SIZE; j++){
                boardList.add(new BoardCell(i, j, null));
            }
            cells.add(boardList);
        }
    }
    public boolean isEmpty(int row, int column) {
        return cells.get(row).get(column).getSymbol() == null;
    }
    public void printBoard() {
        for (int i = 0; i < cells.size(); ++i) {
            for (int j = 0; j < cells.size(); ++j) {
                Symbol symbol = cells.get(i).get(j).getSymbol();

                if (symbol == null) {
                    System.out.printf(" | - | ");
                } else {
                    System.out.printf(" | " + symbol + " | ");
                }
            }
            System.out.printf("\n");
        }
    }

    public void setMove(BoardCell boardcell) {
        cells.get(boardcell.getRow()).get(boardcell.getColumn()).setColumn(boardcell.getColumn());
        cells.get(boardcell.getRow()).get(boardcell.getColumn()).setRow(boardcell.getRow());
        cells.get(boardcell.getRow()).get(boardcell.getColumn()).setSymbol(boardcell.getSymbol());
    }

}
