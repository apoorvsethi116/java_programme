import java.util.Arrays;

public class Q07_CyclicRotate {
    public static void rotateByOne(int[] arr) {
        int n = arr.length;
        int last = arr[n - 1];

        for (int i = n - 1; i > 0; i--) {
            arr[i] = arr[i - 1];
        }
        arr[0] = last;

        System.out.println("Array after cyclic rotation: " + Arrays.toString(arr));
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        rotateByOne(arr);
    }
}

