package Settings.Colors;

import Settings.Color;

public class Red extends Color {

    @Override
    protected void setColor() {
        this.color = "\u001b[31m";
    }
}