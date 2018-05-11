package PieceFactory.Pieces;

import Settings.Color;

public class King extends Piece {

    public King(Color color) {
        super(color);
    }

    @Override
    public boolean isValidMove(Integer startX, Integer startY, Integer endX, Integer endY) {
        return false;
    }

    @Override
    void setName() {
        this.name = "King";
    }
}
