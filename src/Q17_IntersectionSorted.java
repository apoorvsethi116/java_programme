import java.util.*;

public class Q17_IntersectionSorted {
    public static void intersection(int[] a, int[] b) {
        int i = 0, j = 0;
        System.out.print("Intersection: ");
        while (i < a.length && j < b.length) {
            if (a[i] == b[j]) {
                System.out.print(a[i] + " ");
                i++;
                j++;
            } else if (a[i] < b[j]) {
                i++;
            } else {
                j++;
            }
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int[] a = {1, 2, 3, 4, 5};
        int[] b = {2, 4, 6, 8};
        intersection(a, b);
    }
}
