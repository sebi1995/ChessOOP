package Game;

import PieceFactory.PieceFactory;
import PieceFactory.Pieces.Piece;
import Settings.BoardSize;
import Settings.Color;
import Settings.Colors.*;

import java.util.List;

public class Board {

    private Piece[][] board;
    private Player player;
    private Color player1Color, player2Color;
    private Integer boardY,
            boardX,
            pieceRate;

    public Board(Player currentPlayer) {
        this.player = currentPlayer;

        this.player1Color = new Red();
        this.player2Color = new Cyan();

        initiateBoard();


        System.out.println(printBoard());
        flipBoard();
        System.out.println(printBoard());


    }

    private StringBuilder printBoard() {
        StringBuilder stringBuilder = new StringBuilder();

        for (int i = 0; i < boardY; i++) {

            for (int j = 0; j < boardX; j++) {

                if (board[i][j] != null) {
                    String color = board[i][j].getColor();
                    String name = board[i][j].getName();
                    stringBuilder.append(color).append(name).append(new Reset());
                    for (int k = name.length(); k <= 10; ++k) {
                        stringBuilder.append(" ");
                    }
                } else {
                    stringBuilder.append("    ");
                    for (int k = 4; k <= 10; ++k) {
                        stringBuilder.append(" ");
                    }
                }

            }

            stringBuilder.append("\n");
        }

        return stringBuilder;
    }

    private void initiateBoard() {

        BoardSize boardSize = new BoardSize();

        boardY = boardSize.getY();
        boardX = boardSize.getX();
        pieceRate = boardSize.getPieceRate();

        board = new Piece[boardY][boardX];

        PieceFactory pieceFactory = new PieceFactory();

        List<Piece> player1Pieces = pieceFactory.getPieceList(player1Color);
        List<Piece> player2Pieces = pieceFactory.getPieceList(player2Color);

        for (int i = 0; i < boardX; i++) {
            board[boardY - 1][i] = player1Pieces.get(i);
        }

        for (int i = 0; i < boardX; ++i) {
            board[boardX - 2][i] = pieceFactory.getPiece("PAWN", player1Color);
        }

        int n = boardX - 1;
        for (int i = 0; i < boardX; ++i) {
            board[0][i] = player2Pieces.get(n--);
        }

        for (int i = 0; i < boardX; ++i) {
            board[1][i] = pieceFactory.getPiece("PAWN", player2Color);
        }
    }

    private void flipBoard() {
        Piece[][] placeHolder = new Piece[boardY][boardX];

        for (int y = 0; y < boardY; ++y) {
            for (int x = 0; x < boardX; ++x) {

                if (this.board[y][x] != null && this.board[y][x].getColorObject() == player1Color) {
                    placeHolder[boardY - y - 1][boardX - x - 1] = this.board[y][x];
                    this.board[y][x] = null;
                }

            }
        }

        for (int y = boardY - 1; y >= 0; --y) {
            for (int x = 0; x > boardX; ++x) {

                if (this.board[y][x] != null) {
                    this.board[boardY - y - 1][boardX - x - 1] = this.board[y][x];
                    this.board[y][x] = null;
                }

            }
        }

        for (int y = 0; y < boardY; ++y) {
            for (int x = 0; x < boardX; ++x) {

                if (this.board[y][x] != null) {
                    this.board[y][x] = placeHolder[y][x];
                }

            }
        }

    }
}
