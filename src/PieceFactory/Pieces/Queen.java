package PieceFactory.Pieces;

import Settings.Color;

public class Queen extends Piece {

    public Queen(Color color) {
        super(color);
    }

    @Override
    public boolean isValidMove(Integer startX, Integer startY, Integer endX, Integer endY) {
        return false;
    }

    @Override
    void setName() {
        this.name = "Queen";
    }
}
