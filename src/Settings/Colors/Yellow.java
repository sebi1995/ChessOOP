package Settings.Colors;

import Settings.Color;

public class Yellow extends Color {

    @Override
    protected void setColor() {
        this.color = "\u001b[33m";
    }
}
