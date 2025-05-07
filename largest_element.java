public class largest_element {
    public static void main(String[] args) {
        int arr[] = { 2, 2, 2, 2 };
        int max;
        max = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        System.out.println("largest:" + max);
    }
}
