package Lab5p2;

public class Circle extends Shape {
    public final double Pi = 3.14159;
    private double radius;
    public Circle() {
        super();
        radius = 1.0;
    }
    public Circle(double radius) {
        super();
        this.radius = radius;
    }
    public Circle(double radius, String color, boolean filled) {
        super(color, filled);
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }
    public double getArea() {
        return radius*radius*Pi;
    }
    public double getPerimeter() {
        return 2*radius*Pi;
    }
    public String toString() {
        return "Radius: " + getRadius() + ", Color: " + getColor() + ", Is filled: " + isFilled() + ", Area: " + getArea() + ", Perimeter: " + getPerimeter();
    }

    public static void main(String[] args) {
        Circle c = new Circle(3.0);
        System.out.println(c.toString());;
    }
}
