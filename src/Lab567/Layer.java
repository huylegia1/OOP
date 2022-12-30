package Lab567;

import java.util.ArrayList;

public class Layer {
    ArrayList <Shape> shapes = new ArrayList<>();
    private boolean visible;

    public boolean isVisible() {
        return visible;
    }
    public Layer() {
        visible = true;
    }
    public Layer(boolean visible) {
        this.visible = visible;
    }

    public void setVisible(boolean visible) {
        this.visible = visible;
    }
    public void delTriangle() {
        for (int i=0; i< shapes.size(); i++) {
            if (shapes.get(i) instanceof Triangle) {
                shapes.remove(i);
            }
        }
    }
    public String toString() {
        String s = "Layer:\n Is visible: " + isVisible() + "\n";
        for (int i=0; i< shapes.size(); i++) {
            s+= shapes.get(i).toString() + "\n";
        }
        return s;
    }
}
