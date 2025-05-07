import java.util.*;

public class fibonacci {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first and second number: ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c;
        System.out.print(a + "," + b + ",");
        for (int i = 0; i < 10; i++) {
            c = a + b;
            a = b;
            b = c;
            System.out.print(c + ",");
        }
        sc.close();
    }
}
