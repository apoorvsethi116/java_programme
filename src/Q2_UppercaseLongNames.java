import java.util.*;
import java.util.stream.*;

public class Q2_UppercaseLongNames {
    public static List<String> uppercaseNamesWithMoreThan3Chars(List<String> names) {
        return names.stream()
                .filter(name -> name.length() > 3)
                .map(String::toUpperCase)
                .collect(Collectors.toList());
    }

    public static void main(String[] args) {
        List<String> input = Arrays.asList("Ram", "Shyam", "Om", "Sita");
        System.out.println(uppercaseNamesWithMoreThan3Chars(input)); // Output: [SHYAM, SITA]
    }
}
