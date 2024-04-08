package TicTacToe;

public interface Player {
    public BoardCell makeMove(Board board);

    Player get(int nextPlayerIndex);

    Symbol getSymbol();
}
