package TicTacToe;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class TicTacToe {
    public static final int BOARD_SIZE=3;
    public static List<Player> players = new ArrayList<>();

    private static final Logger log = Logger.getLogger(TicTacToe.class);


    public static void main(String[] args) {
        //Introduction Welcome Line//
        //Create Players//
        HumanPlayer human=getUserInput();
        players.add(human);
        BotPlayer bot=getBotPlayer(human);
        players.add(bot);
        Board board=new Board();
        Game game=createGame(board);
        game.start();

        //Until Game is Won or Draw//
        while(game.getStatus() == GameStatus.Progress){
            Player player= game.getNextPlayer();
            System.out.println("Next player: " + player.getSymbol());
            game.makeMove();
            game.getBoard().printBoard();
        }
        return;
    }

    private static Game createGame(Board board) {
        return new Game(board);
    }

    private static BotPlayer getBotPlayer(HumanPlayer human) {
        System.out.println("Choose the Difficulty Level of the Bot - EASY or MEDIUM or HARD");
        Scanner scanner=new Scanner(System.in);
        Level level=Level.valueOf(scanner.nextLine());
        Symbol symbol=getBotSymbol(human.getSymbol());
        return new BotPlayer(level, symbol);
    }

    private static Symbol getBotSymbol(Symbol humanSymbol) {
        if(humanSymbol == Symbol.O){return Symbol.X;}
        return Symbol.O;
    }

    public static HumanPlayer getUserInput() {
        System.out.println("Welcome to TicTacToe");
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter Name");
        String name = scanner.nextLine();
        System.out.println("Enter Email");
        String email = scanner.nextLine();
        System.out.println("Enter Symbol O or X");
        Symbol symbol;
        try {
            symbol = Symbol.valueOf(scanner.nextLine());
        } catch (IllegalArgumentException e) {
            System.out.println("Invalid Symbol: Enter O or X");
            return null;
        }
        User user = new User(name, email, null);
        return new HumanPlayer(user, symbol);

    }
}
