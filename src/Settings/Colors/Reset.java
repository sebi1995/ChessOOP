package Settings.Colors;

import Settings.Color;

public class Reset extends Color {

    @Override
    protected void setColor() {
        this.color = "\u001b[0m";
    }
}
