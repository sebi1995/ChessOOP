package Settings.Colors;

import Settings.Color;

public class Cyan extends Color {
    @Override
    protected void setColor() {
        this.color = "\u001b[36m";
    }
}
