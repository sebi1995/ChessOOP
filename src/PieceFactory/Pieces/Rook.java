package PieceFactory.Pieces;

import PieceFactory.PieceFactory;
import PieceFactory.Pieces.Piece;
import Settings.Color;

public class Rook extends Piece {

    public Rook(Color color) {
        super(color);
    }

    @Override
    public boolean isValidMove(Integer startX, Integer startY, Integer endX, Integer endY) {
        return false;
    }

    @Override
    void setName() {
        this.name = "Rook";
    }
}
