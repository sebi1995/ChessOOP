package PieceFactory;

import Game.Board;
import PieceFactory.Pieces.*;
import Settings.BoardSize;
import Settings.Color;

import java.util.ArrayList;
import java.util.List;

public class PieceFactory {

    public Piece getPiece(String piece, Color color) {
        if (piece == null || color == null) {
            return null;

        } else if (piece.equalsIgnoreCase("PAWN")) {
            return new Pawn(color);

        } else if (piece.equalsIgnoreCase("ROOK")) {
            return new Rook(color);

        } else if (piece.equalsIgnoreCase("KNIGHT")) {
            return new Knight(color);

        } else if (piece.equalsIgnoreCase("BISHOP")) {
            return new Bishop(color);

        } else if (piece.equalsIgnoreCase("KING")) {
            return new King(color);

        } else if (piece.equalsIgnoreCase("QUEEN")) {
            return new Queen(color);

        } else
            return null;
    }

    public List<Piece> getPieceList(Color color) {

        List<Piece> pieces = new ArrayList<>(new BoardSize().getY());
        pieces.add(getPiece("ROOK", color));
        pieces.add(getPiece("KNIGHT", color));
        pieces.add(getPiece("BISHOP", color));
        pieces.add(getPiece("QUEEN", color));
        pieces.add(getPiece("KING", color));
        pieces.add(getPiece("BISHOP", color));
        pieces.add(getPiece("KNIGHT", color));
        pieces.add(getPiece("ROOK", color));

        return pieces;
    }
}
