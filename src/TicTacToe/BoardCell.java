package TicTacToe;

public class BoardCell {
    private int row;
    private int column;
    private Symbol symbol;

    public BoardCell(int row, int column, Symbol symbol) {
        this.row = row;
        this.column = column;
        this.symbol = symbol;
    }

    public int getRow() {
        return row;
    }

    public int getColumn() {
        return column;
    }

    public Symbol getSymbol() {
        return symbol;
    }

    public void setRow(int row){
        this.row=row;
    }
    public void setColumn(int column){
        this.column=column;
    }
    public void setSymbol(Symbol symbol){
        this.symbol=symbol;
    }
}
