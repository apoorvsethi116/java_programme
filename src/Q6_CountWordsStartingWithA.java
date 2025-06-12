import java.util.*;
import java.util.stream.*;

public class Q6_CountWordsStartingWithA {
    public static long countStringsStartingWithA(List<String> words) {
        return words.stream()
                .filter(w -> w.toLowerCase().startsWith("a"))
                .count();
    }

    public static void main(String[] args) {
        List<String> input = Arrays.asList("apple", "banana", "apricot", "cherry", "Avocado");
        System.out.println(countStringsStartingWithA(input)); // Output: 3
    }
}
