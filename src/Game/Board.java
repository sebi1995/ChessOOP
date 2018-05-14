package Game;

import PieceFactory.PieceFactory;
import PieceFactory.Pieces.Piece;
import Settings.BoardSize;
import Settings.Color;
import Settings.Colors.Black;
import Settings.Colors.Red;
import Settings.Colors.White;

import java.util.List;

public class Board {

    private Piece[][] board;
    private Player player;
    private Integer boardY,
            boardX,
            pieceRate;
    private String resetColor = "\u001B[0m";

    public Board(Player currentPlayer) {
        this.player = currentPlayer;
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
                    stringBuilder.append(color).append(name).append(resetColor);
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

        List<Piece> blackPieces = pieceFactory.getPieceList(new Black());
        List<Piece> whitePieces = pieceFactory.getPieceList(new White());

        for (int i = 0; i < boardX; i++) {
            board[boardY - 1][i] = blackPieces.get(i);
        }

        for (int i = 0; i < boardX; ++i) {
            board[boardX - 2][i] = pieceFactory.getPiece("PAWN", new Black());
        }

        int n = boardX - 1;

        for (int i = 0; i < boardX; ++i) {
            board[0][i] = whitePieces.get(n--);
        }

        for (int i = 0; i < boardX; ++i) {
            board[1][i] = pieceFactory.getPiece("PAWN", new White());
        }
    }

    private void flipBoard() {
        Piece[][] placeHolder = new Piece[boardY][boardX];

        for (int y = 0; y < boardY; ++y) {
            for (int x = 0; x < boardX; ++x) {
                if (this.board[y][x] != null && this.board[y][x].getColorObject() instanceof Black) {
                    placeHolder[boardY - y - 1][boardX - x-1] = this.board[y][x];
                    this.board[y][x] = null;
                }
            }
        }

        for (int y = 0; y < boardY; ++y) {
            for (int x = 0; x < boardX; ++x) {
                if (this.board[y][x] != null && this.board[y][x].getColorObject() instanceof Red) {
                    this.board[boardY - y-1][boardX - x-1] = this.board[y][x];
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
