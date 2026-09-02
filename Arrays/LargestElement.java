public class SecondLargest {
    public static void main(String[] args) {

        int[] arr = {10, 5, 8, 20, 3};

        int max = arr[0];
        int sl = arr[0];

        for (int i = 1; i < arr.length; i++) {

            if (arr[i] > max) {
                sl = max;
                max = arr[i];
            }
            else if (arr[i] > sl && arr[i] != max) {
                sl = arr[i];
            }
        }

        System.out.println("Second largest: " + sl);
    }
}