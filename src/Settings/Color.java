package Settings;

public abstract class Color {

    protected String color;

    protected Color() {
        setColor();
    }

    protected abstract void setColor();

    @Override
    public String toString() {
        return this.color;
    }
}
