package Lab567;

public class Shape {
    protected String color = "Red";
    protected boolean filled = true;
    protected double posx, posy;
    public Shape() {
        color = "Red";
        filled = true;
        posx = 0.0;
        posy = 0.0;
    }
    public Shape(String color, boolean filled) {
        this.color = color;
        this.filled = filled;
        posx = 0.0;
        posy = 0.0;
    }
    public Shape(String color, boolean filled, double posx, double posy) {
        this.color = color;
        this.filled = filled;
        this.posx = posx;
        this.posy=posy;
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

    public double getPosx() {
        return posx;
    }

    public void setPosx(double posx) {
        this.posx = posx;
    }

    public double getPosy() {
        return posy;
    }

    public void setPosy(double posy) {
        this.posy = posy;
    }

    public String toString() {
        return "Color: " + ", " + getColor() + "Is filled: " + isFilled() + " ,Position: " + posx + ";" + posy;
    }
}
