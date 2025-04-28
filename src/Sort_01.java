import java.util.Arrays;

public class Sort_01 {
    public static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 2, 1, 3, 55, 3, 22, 4, 3224, 3, 2};
        int n = arr.length;

        for (int i = 0; i < n - 1; i++) {
            for (int j = i + 1; j < n; j++) {
                if (arr[i] > arr[j]) {
                    swap(arr, i, j);
                }
            }
        }


        for (int val: arr){
            System.out.print(val + " ");
        }
    }
}
