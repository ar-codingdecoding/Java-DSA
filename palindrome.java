import java.util.*;

public class palindrome {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int n = sc.nextInt();
        int m = n;
        int r;
        int rev = 0;
        while (n > 0) {
            r = n % 10;
            rev = rev * 10 + r;
            n = n / 10;
        }
        if (rev == m) {
            System.out.print("It is palindrome");
        } else {
            System.out.print("It is not palindrome");
        }
        sc.close();
    }
}
