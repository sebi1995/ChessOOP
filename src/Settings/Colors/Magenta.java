package Settings.Colors;

import Settings.Color;

public class Magenta extends Color {

    @Override
    protected void setColor() {
        this.color = "\u001b[35m";
    }
}
