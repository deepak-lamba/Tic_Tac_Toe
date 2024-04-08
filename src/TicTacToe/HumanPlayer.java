package TicTacToe;

import java.util.Scanner;

public class HumanPlayer implements Player{

    private Symbol symbol;
    private User user;
    private Scanner scanner = new Scanner(System.in);

    public HumanPlayer(User user, Symbol symbol) {
        this.symbol=symbol;
        this.user=user;
    }

    @Override
    public BoardCell makeMove(Board board){
        System.out.println("Enter Row and Column");
        int row = scanner.nextInt();
        int column = scanner.nextInt();
        return new BoardCell(row, column, getSymbol());
    }
    @Override
    public Symbol getSymbol() {
        return symbol;
    }
    @Override
    public Player get(int nextPlayerIndex){
        return null;
    }
}
