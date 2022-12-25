package Lab3;
import java.util.Scanner;

public class GCD {
    public static void main(String[] args) {
        Scanner so = new Scanner(System.in);
        int so1 = so.nextInt();
        int so2 = so.nextInt();
        while (so1!=so2) {
            if (so1>so2) {
                so1 = so1-so2;
            }
            else {
                so2= so2-so1;
            }
        }
        System.out.println(so2);
    }
}
