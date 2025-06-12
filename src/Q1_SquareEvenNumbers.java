import java.util.*;
import java.util.stream.*;

public class Q1_SquareEvenNumbers {
    public static List<Integer> squareOfEvenNumbers(List<Integer> numbers) {
        return numbers.stream()
                .filter(n -> n % 2 == 0)
                .map(n -> n * n)
                .collect(Collectors.toList());
    }

    public static void main(String[] args) {
        List<Integer> input = Arrays.asList(1, 2, 3, 4, 5);
        System.out.println(squareOfEvenNumbers(input)); // Output: [4, 16]
    }
}
