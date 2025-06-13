import java.util.*;

public class Q19_MergeSortedArrays {
    public static void merge(int[] arr1, int[] arr2) {
        int n = arr1.length, m = arr2.length;
        int i = n - 1, j = 0;

        while (i >= 0 && j < m && arr1[i] > arr2[j]) {
            int temp = arr1[i];
            arr1[i] = arr2[j];
            arr2[j] = temp;
            i--;
            j++;
        }

        Arrays.sort(arr1);
        Arrays.sort(arr2);

        System.out.println("Merged arrays:");
        System.out.println("Array 1: " + Arrays.toString(arr1));
        System.out.println("Array 2: " + Arrays.toString(arr2));
    }

    public static void main(String[] args) {
        int[] arr1 = {1, 3, 5, 7};
        int[] arr2 = {0, 2, 6, 8, 9};
        merge(arr1, arr2);
    }
}
