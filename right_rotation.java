public class right_rotation {
    public static void main(String[] args) {
        int A[] = { 3, 5, 6, 2, 8, 9 };
        for (int x : A)
            System.out.print(x + " ");
        System.out.println();

        int temp = A[A.length - 1];
        for (int i = A.length - 1; i > 0; i--) {
            A[i] = A[i - 1];
        }
        A[0] = temp;
        for (int x : A)
            System.out.print(x + ",");
        System.out.println("");

    }

}
