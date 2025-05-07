import java.util.*;

public class gpSeries {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a, cr and n: ");
        int a = sc.nextInt();
        int cr = sc.nextInt();
        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            System.out.print(a + ",");
            a = a * cr;

        }

        sc.close();
    }
}
