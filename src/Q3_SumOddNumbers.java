import java.util.*;
import java.util.stream.*;

public class Q3_SumOddNumbers {
    public static int sumOfOddNumbers(List<Integer> numbers) {
        return numbers.stream()
                .filter(n -> n % 2 != 0)
                .reduce(0, Integer::sum);
    }

    public static void main(String[] args) {
        List<Integer> input = Arrays.asList(1, 2, 3, 4, 5);
        System.out.println(sumOfOddNumbers(input)); // Output: 9
    }
}
