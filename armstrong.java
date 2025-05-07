import java.util.*;

public class armstrong {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int n = sc.nextInt();
        int m = n;
        int sum = 0;
        while (n > 0) {
            int r = n % 10;
            sum = sum + r * r * r;
            n = n / 10;
        }
        if (sum == m)
            System.out.print(sum + " is an armstrong number");
        else
            System.out.print(sum + " is not an armstrong number");
        sc.close();
    }
}
