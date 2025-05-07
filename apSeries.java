import java.util.*;

public class apSeries {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a, d, n: ");
        int a = sc.nextInt();
        int d = sc.nextInt();
        int n = sc.nextInt();
        
        for (int i = 0; i < n; i++) {

            System.out.print(a + ",");
            a = a + d;
        }
        sc.close();
    }

}
