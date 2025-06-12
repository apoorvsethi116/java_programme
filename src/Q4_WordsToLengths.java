import java.util.*;
import java.util.stream.*;

public class Q4_WordsToLengths {
    public static List<Integer> wordsToLengths(List<String> words) {
        return words.stream()
                .map(String::length)
                .collect(Collectors.toList());
    }

    public static void main(String[] args) {
        List<String> input = Arrays.asList("Java", "Stream", "API");
        System.out.println(wordsToLengths(input)); // Output: [4, 6, 3]
    }
}
