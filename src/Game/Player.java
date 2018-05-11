package Game;

import Settings.Color;

public class Player {

    private String name;
    private Color color;

    Player(String name){
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    public String getColor() {
        return color.toString();
    }

    public Color getColorObject(){
        return this.color;
    }
}
