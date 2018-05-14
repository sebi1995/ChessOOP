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

        BoardSize boardSize = new BoardSize();
        List<Piece> pieces = new ArrayList<>(boardSize.getY());

        Integer rate = boardSize.getPieceRate();

        for (int i = 0; i < rate; ++i) {
            pieces.add(getPiece("ROOK", color));
        }
        for (int i = 0; i < rate; ++i) {
            pieces.add(getPiece("KNIGHT", color));
        }
        for (int i = 0; i < rate; ++i) {
            pieces.add(getPiece("BISHOP", color));
        }
        for (int i = 0; i < rate; ++i) {
            pieces.add(getPiece("QUEEN", color));
        }
        for (int i = 0; i < rate; ++i) {
            pieces.add(getPiece("KING", color));
        }
        for (int i = 0; i < rate; ++i) {
            pieces.add(getPiece("BISHOP", color));
        }
        for (int i = 0; i < rate; ++i) {
            pieces.add(getPiece("KNIGHT", color));
        }
        for (int i = 0; i < rate; ++i) {
            pieces.add(getPiece("ROOK", color));
        }

        return pieces;
    }
}
