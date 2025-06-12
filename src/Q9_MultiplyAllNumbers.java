import java.util.*;
import java.util.stream.*;

public class Q9_MultiplyAllNumbers {
    public static int multiplyAllNumbers(List<Integer> numbers) {
        return numbers.stream()
                .reduce(1, (a, b) -> a * b);
    }

    public static void main(String[] args) {
        List<Integer> input = Arrays.asList(1, 2, 3, 4);
        System.out.println(multiplyAllNumbers(input)); // Output: 24
    }
}
