import java.util.*;
import java.util.stream.*;

public class Q7_CommaSeparatedNames {
    public static String namesWithMoreThan4Letters(List<String> names) {
        return names.stream()
                .filter(name -> name.length() > 4)
                .collect(Collectors.joining(","));
    }

    public static void main(String[] args) {
        List<String> input = Arrays.asList("John", "Ravi", "Abhishek", "Raj");
        System.out.println(namesWithMoreThan4Letters(input)); // Output: Abhishek
    }
}
