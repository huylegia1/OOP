package Lab567;

import java.util.ArrayList;

public class Test {
    public static void main(String[] args) {
        Circle c1 = new Circle();
        Rectangle r1 = new Rectangle();
        Square s2 = new Square();
        Triangle t2 = new Triangle();
        Layer layer1 = new Layer();
        Layer layer2 = new Layer(true);
        layer1.shapes.add(c1);
        layer1.shapes.add(r1);
        layer2.shapes.add(s2);
        layer2.shapes.add(t2);
        layer2.delTriangle();
        Diagram diagram = new Diagram();
        diagram.layers.add(layer1);
        diagram.layers.add(layer2);
        diagram.delCircle();
        System.out.println(diagram.toString());
    }
}
