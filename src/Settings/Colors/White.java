package Settings.Colors;

import Settings.Color;

public class White extends Color {

    @Override
    protected void setColor() {
        this.color = "\u001b[37m";
    }
}