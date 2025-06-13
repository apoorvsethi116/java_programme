import java.util.*;

public class Q06_UnionIntersection {
    public static void printUnion(int[] a, int[] b) {
        Set<Integer> union = new HashSet<>();
        for (int num : a) union.add(num);
        for (int num : b) union.add(num);
        System.out.println("Union: " + union);
    }

    public static void printIntersection(int[] a, int[] b) {
        Set<Integer> set = new HashSet<>();
        Set<Integer> intersection = new HashSet<>();
        for (int num : a) set.add(num);
        for (int num : b) {
            if (set.contains(num)) intersection.add(num);
        }
        System.out.println("Intersection: " + intersection);
    }

    public static void main(String[] args) {
        int[] a = {1, 2, 4, 5, 6};
        int[] b = {2, 3, 5, 7};
        printUnion(a, b);
        printIntersection(a, b);
    }
}
