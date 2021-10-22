package designPattern.withLambda;

import java.util.List;
import java.util.Map;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class BetterExample {
    public static void main(String[] args) {

    }

    private static int totalValue(List<Integer> numbers, Predicate predicate) {
        return numbers.stream()
                .filter(predicate)
                .mapToInt( e-> (int)e)
                .sum();
    }



}
