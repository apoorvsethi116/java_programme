import java.util.*;
import java.util.stream.*;

public class Q5_SumPricesAbove1000 {
    public static int sumOfPricesAbove1000(List<Integer> prices) {
        return prices.stream()
                .distinct()
                .filter(p -> p > 1000)
                .reduce(0, Integer::sum);
    }

    public static void main(String[] args) {
        List<Integer> input = Arrays.asList(999, 1000, 1500, 1000, 2000);
        System.out.println(sumOfPricesAbove1000(input)); // Output: 3500
    }
}
