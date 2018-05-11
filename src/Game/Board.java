package Game;

import PieceFactory.PieceFactory;
import PieceFactory.Pieces.Piece;
import PieceFactory.Pieces.Position;
import Settings.BoardPieceRate;
import Settings.BoardSize;
import Settings.Colors.Black;

import java.util.ArrayList;
import java.util.List;

public class Board {

    Piece[][] pieces;
    Player player;

    public Board(Player currentPlayer) {
        this.player = currentPlayer;
        initiateBoard();
    }

    private void initiateBoard() {

        BoardSize boardSize = new BoardSize();
        BoardPieceRate boardPieceRate = new BoardPieceRate();

        Integer boardY = boardSize.getY(),
                boardX = boardSize.getX(),
                pieceRate = boardPieceRate.getPieceRate();

        pieces = new Piece[boardY][boardX];

        for (int i = 0; i < boardY; i++) {
            
        }

        PieceFactory pieceFactory = new PieceFactory();

        List<Piece> pieces = new ArrayList<>();
        pieces.add(pieceFactory.getPiece("ROOK", new Black()));
        pieces.get(0).setPosition(new Position(0,1));
        pieces.add(pieceFactory.getPiece("KNIGHT", new Black()));
        pieces.add(pieceFactory.getPiece("BISHOP", new Black()));
        pieces.add(pieceFactory.getPiece("QUEEN", new Black()));
        pieces.add(pieceFactory.getPiece("KING", new Black()));
        pieces.add(pieceFactory.getPiece("BISHOP", new Black()));
        pieces.add(pieceFactory.getPiece("KNIGHT", new Black()));
        pieces.add(pieceFactory.getPiece("ROOK", new Black()));

    }
}
