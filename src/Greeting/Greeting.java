package Greeting;

public class Greeting {
    private String text;
    public void setText(String text) {
        this.text = text;
    }
    public String getText() {
        return this.text;
    }
    public void greet() {
        System.out.println(text);
    }
}
