package Game;

import PieceFactory.PieceFactory;
import PieceFactory.Pieces.Piece;
import Settings.BoardSize;
import Settings.Colors.Black;
import Settings.Colors.White;

import java.util.List;

public class Board {

    Piece[][] board;
    Player player;
    Integer boardY,
            boardX,
            pieceRate;

    public Board(Player currentPlayer) {
        this.player = currentPlayer;
        initiateBoard();


        printBoard();


    }

    private void printBoard() {
        for (int i = 0; i < boardY; i++) {
            for (int j = 0; j < boardX; j++) {
                if (board[i][j] != null) {
                    System.out.print(board[i][j].getName());
                } else {
                    System.out.print("NULL");
                }
            }
            System.out.println();
        }
    }

    private void initiateBoard() {

        BoardSize boardSize = new BoardSize();

        boardY = boardSize.getY();
        boardX = boardSize.getX();
        pieceRate = boardSize.getPieceRate();

        board = new Piece[boardY][boardX];

        PieceFactory pieceFactory = new PieceFactory();

        List<Piece> blackPieces = pieceFactory.getPieceList(new Black());
        System.out.println(blackPieces.size());
        List<Piece> whitePieces = pieceFactory.getPieceList(new White());

        for (int i = 0; i < boardX; i++) {
            if (blackPieces.get(i) == null) {
                break;
            }
            board[boardY - 1][i] = blackPieces.get(i);
        }
    }
}
