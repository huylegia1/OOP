package Lab5p2;

public class Square extends Rectangle {
    private double side;
    public Square() {
        super();
        side = 1.0;
    }
    public Square(double side) {
        super();
        this.side = side;
    }
    public Square(double side, String color, boolean filled) {
        this.side = side;
        this.color = color;
        this.filled = filled;
    }

    public double getSide() {
        return side;
    }

    public void setSide(double side) {
        this.side = side;
    }
    public String toString() {
        return "Side: " + getSide() + ", Color: " + getColor() + ", Is filled: " + isFilled() + ", Area: s" + getArea() + ", Perimeter: " + getPerimeter();
    }
}
