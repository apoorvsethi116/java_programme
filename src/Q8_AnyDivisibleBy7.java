import java.util.*;
import java.util.stream.*;

public class Q8_AnyDivisibleBy7 {
    public static boolean anyNumberDivisibleBy7(List<Integer> numbers) {
        return numbers.stream()
                .anyMatch(n -> n % 7 == 0);
    }

    public static void main(String[] args) {
        List<Integer> input = Arrays.asList(10, 14, 22, 30);
        System.out.println(anyNumberDivisibleBy7(input)); // Output: true
    }
}

