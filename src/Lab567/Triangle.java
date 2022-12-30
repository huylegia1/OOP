package Lab567;

import java.lang.Math;

public class Triangle extends Shape {
    private double side1;
    private double side2;
    private double side3;
    public Triangle() {
        super();
        side1 = 1.0;
        side2 = 1.0;
        side3 = 1.0;
    }
    public Triangle(double side1, double side2, double side3) {
        super();
        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;
    }
    public Triangle(double side1, double side2, double side3, String color, boolean filled) {
        super(color, filled);
        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;
    }
    public double getArea() {
        double p = (side1+side2+side3)/2;
        return Math.sqrt(p*(p-side1)*(p-side2)*(p-side3));
    }
    public double getPerimeter() {
        return side1+side2+side3;
    }
    public String toString() {
        return "Triangle: " + super.toString() + ", Area: " + getArea() + ", Perimeter: " + getPerimeter();
    }
}
