public class second_largest {
    public static void main(String[] args) {

        int[] arr = { 2, 2, 2, 2 };
        int max1 = arr[0];
        int max2 = Integer.MIN_VALUE;

        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > max1) {
                max2 = max1;
                max1 = arr[i];
            } else if (arr[i] > max2 && arr[i] != max1) {
                max2 = arr[i];
            }
        }

        if (max2 == Integer.MIN_VALUE) {
            System.out.println("-1");
        } else {
            System.out.println(max2);
        }

    }
}