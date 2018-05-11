package Game;

import Settings.Colors.Black;
import Settings.Colors.White;

import java.util.Random;

public class Game {

    private Board board;
    private Player player1, player2;
    private Player currentPlayer;

    public Game() {
        player1 = new Player("sebi");
        player2 = new Player("computer");

        Random random = new Random();
        Boolean isPlayer1First = random.nextBoolean();

        currentPlayer = (isPlayer1First) ? player1 : player2;

        if (currentPlayer == player1) {
            player1.setColor(new Black());
            player2.setColor(new White());
        } else {
            player1.setColor(new White());
            player2.setColor(new Black());
        }

        board = new Board(currentPlayer);
    }

    public void startGame() {

    }
}
