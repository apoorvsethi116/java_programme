import java.util.*;

public class Q10_LeadersInArray {
    public static void printLeaders(int[] arr) {
        int n = arr.length;
        List<Integer> leaders = new ArrayList<>();
        int maxRight = arr[n - 1];
        leaders.add(maxRight);

        for (int i = n - 2; i >= 0; i--) {
            if (arr[i] > maxRight) {
                maxRight = arr[i];
                leaders.add(maxRight);
            }
        }

        Collections.reverse(leaders);
        System.out.println("Leaders: " + leaders);
    }

    public static void main(String[] args) {
        int[] arr = {16, 17, 4, 3, 5, 2};
        printLeaders(arr);
    }
}
