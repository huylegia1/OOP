package Greeting;

public class TestGreeting {
    public static void main(String[] args) {
        Greeting gr = new Greeting();
        gr.setText("abc");
        System.out.println(gr.getText());
        gr.greet();
        Greeting gr1 = new Greeting();
        gr1.setText("def");
        System.out.println(gr1.getText());
        gr1.greet();
    }
}
