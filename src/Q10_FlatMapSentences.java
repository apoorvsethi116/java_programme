import java.util.*;
import java.util.stream.*;

public class Q10_FlatMapSentences {
    public static List<String> flattenSentencesToWords(List<String> sentences) {
        return sentences.stream()
                .flatMap(sentence -> Arrays.stream(sentence.split(" ")))
                .collect(Collectors.toList());
    }

    public static void main(String[] args) {
        List<String> input = Arrays.asList("Java is fun", "Streams are powerful");
        System.out.println(flattenSentencesToWords(input));
        // Output: [Java, is, fun, Streams, are, powerful]
    }
}
