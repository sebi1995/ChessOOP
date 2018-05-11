package PieceFactory;

import PieceFactory.Pieces.*;
import Settings.Color;

public class PieceFactory {

    public Piece getPiece(String piece, Color color) {

        if (piece == null || color == null) {
            return null;

        } else if (piece.equalsIgnoreCase("PAWN")) {
            return new Pawn(color);

        } else if (piece.equalsIgnoreCase("ROOK")) {
            return new Rook(color);

        } else if (piece.equalsIgnoreCase("BISHOP")) {
            return new Bishop(color);

        } else if (piece.equalsIgnoreCase("KING")) {
            return new King(color);

        } else if (piece.equalsIgnoreCase("QUEEN")) {
            return new Queen(color);

        } else if (piece.equalsIgnoreCase("KNIGHT")) {
            return new Knight(color);

        }

        return null;
    }
}
