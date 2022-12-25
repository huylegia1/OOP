package Lab5p2;

public class Shape {
    protected String color = "Red";
    protected boolean filled = true;
    public Shape() {
        color = "Red";
        filled = true;
    }
    public Shape(String color, boolean filled) {
        this.color = color;
        this.filled = filled;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public boolean isFilled() {
        return filled;
    }

    public void setFilled(boolean filled) {
        this.filled = filled;
    }
    public String toString() {
        return "Color: " + ", " + getColor() + "Is filled: " + isFilled();
    }
}
