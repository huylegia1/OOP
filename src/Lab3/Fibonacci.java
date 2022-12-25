package Lab3;
import java.util.Scanner;
public class Fibonacci {
   public static int Fibo(int n) {
       if (n==1 || n==2) {
           return 1;
       }
       else {
           return Fibo(n-1)+Fibo(n-2);
       }
   }

    public static void main(String[] args) {
        Scanner so = new Scanner(System.in);
        int num = so.nextInt();
        System.out.println(Fibo(num));
    }
}
