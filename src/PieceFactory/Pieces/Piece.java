package PieceFactory.Pieces;

import Settings.Color;
import javafx.geometry.Pos;

public abstract class Piece {

    private Position position;
    String name;
    private Color color;

    Piece(Color color) {
        this.color = color;
        setName();
    }

    public abstract boolean isValidMove(Integer startX, Integer startY, Integer endX, Integer endY);

    abstract void setName();

    public String getName() {
        return name;
    }

    public Integer getX() {
        return position.getX();
    }

    public Integer getY() {
        return position.getY();
    }

    public void setX(Integer x){
        this.position.setX(x);
    }

    public void setY(Integer y){
        this.position.setY(y);
    }

    public Position getPosition() {
        return position;
    }

    public void setPosition(Position position) {
        this.position = position;
    }

    public String getColor() {
        return color.toString();
    }

    public void setColor(Color color) {
        this.color = color;
    }

    public Color getColorObject() {
        return this.color;
    }
}
