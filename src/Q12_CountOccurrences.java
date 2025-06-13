import java.util.*;

public class Q12_CountOccurrences {
    public static void countOccurrences(int[] arr) {
        Map<Integer, Integer> map = new HashMap<>();

        for (int num : arr) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }

        System.out.println("Element Occurrences:");
        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 2, 3, 1, 4, 2};
        countOccurrences(arr);
    }
}
