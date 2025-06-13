import java.util.Arrays;

public class Q05_MoveNegatives {
    public static void moveNegativesToLeft(int[] arr) {
        int j = 0;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < 0) {
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
                j++;
            }
        }

        System.out.println("Array after moving negatives: " + Arrays.toString(arr));
    }

    public static void main(String[] args) {
        int[] arr = {-1, 2, -3, 4, 5, -6};
        moveNegativesToLeft(arr);
    }
}
