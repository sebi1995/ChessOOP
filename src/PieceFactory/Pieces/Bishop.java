package PieceFactory.Pieces;

import Settings.Color;

public class Bishop extends Piece {

    public Bishop(Color color) {
        super(color);
    }

    @Override
    public boolean isValidMove(Integer startX, Integer startY, Integer endX, Integer endY) {
        return false;
    }

    @Override
    void setName() {
        this.name = "Bishop";
    }
}
