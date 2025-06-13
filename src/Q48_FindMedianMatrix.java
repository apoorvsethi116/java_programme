import java.util.*;

public class Q48_FindMedianMatrix {
    public static int findMedian(int[][] matrix) {
        int r = matrix.length;
        int c = matrix[0].length;

        int min = Integer.MAX_VALUE, max = Integer.MIN_VALUE;
        for (int i = 0; i < r; i++) {
            min = Math.min(min, matrix[i][0]);
            max = Math.max(max, matrix[i][c - 1]);
        }

        int desired = (r * c + 1) / 2;
        while (min < max) {
            int mid = (min + max) / 2;
            int place = 0;

            for (int i = 0; i < r; ++i) {
                place += Arrays.binarySearch(matrix[i], mid + 1);
                if (place < 0) place = ~place;
            }

            if (place < desired)
                min = mid + 1;
            else
                max = mid;
        }
        return min;
    }

    public static void main(String[] args) {
        int[][] matrix = {
                {1, 3, 5},
                {2, 6, 9},
                {3, 6, 9}
        };

        System.out.println("Median is: " + findMedian(matrix));
    }
}
