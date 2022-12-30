package Lab567;

import java.util.ArrayList;

public class Diagram {
    ArrayList <Layer> layers = new ArrayList<>();
    public String toString() {
        String s = "Diagram:\n";
        for (int i=0; i< layers.size(); i++) {
            if (layers.get(i).isVisible() == true) {
                s+= layers.get(i).toString() + "\n";
            }
        }
        return s;
    }
    public void delCircle() {
        for (int i=0; i<layers.size(); i++) {
            for (int j=0; j<layers.get(i).shapes.size(); j++) {
                if (layers.get(i).shapes.get(j) instanceof Circle) {
                    layers.get(i).shapes.remove(j);
                }
            }
        }
    }
}
