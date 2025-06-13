import java.util.Arrays;

public class Q03_KthMaxMin {
    public static void findKthMinMax(int[] arr, int k) {
        Arrays.sort(arr);
        int n = arr.length;

        if (k > 0 && k <= n) {
            System.out.println(k + "th Minimum: " + arr[k - 1]);
            System.out.println(k + "th Maximum: " + arr[n - k]);
        } else {
            System.out.println("Invalid value of k");
        }
    }

    public static void main(String[] args) {
        int[] arr = {7, 10, 4, 3, 20, 15};
        int k = 3;
        findKthMinMax(arr, k);
    }
}

