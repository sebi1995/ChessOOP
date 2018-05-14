package Settings.Colors;

import Settings.Color;

public class Black extends Color {

    @Override
    protected void setColor() {
        this.color = "\u001B[30m";
    }
}
