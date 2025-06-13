import java.util.*;

public class Q13_PairsWithSum {
    public static void findPairs(int[] arr, int target) {
        Set<Integer> seen = new HashSet<>();
        Set<String> output = new HashSet<>();

        for (int num : arr) {
            int complement = target - num;
            if (seen.contains(complement)) {
                int a = Math.min(num, complement);
                int b = Math.max(num, complement);
                output.add(a + "," + b);
            }
            seen.add(num);
        }

        System.out.println("Pairs with sum " + target + ":");
        for (String pair : output) {
            System.out.println("(" + pair.replace(",", ", ") + ")");
        }
    }

    public static void main(String[] args) {
        int[] arr = {1, 5, 7, -1, 5};
        int target = 6;
        findPairs(arr, target);
    }
}
