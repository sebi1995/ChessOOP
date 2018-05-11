package PieceFactory.Pieces;

import javafx.geometry.Pos;

public class Position {

    private Integer x;
    private Integer y;

    public Position(Integer x, Integer y){
        this.x = x;
        this.y = y;
    }

    public Integer getY() {
        return y;
    }

    public Integer getX() {
        return x;
    }

    public void setX(Integer x) {
        this.x = x;
    }

    public void setY(Integer y) {
        this.y = y;
    }
}
