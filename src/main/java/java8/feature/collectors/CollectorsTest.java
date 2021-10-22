package java8.feature.collectors;

import java.util.List;
import java.util.Map;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class CollectorsTest {
    public static void main(String[] args) {
        List<Integer> numbers = List.of(1,2,3,4,5,6,7,8,9,10);
        System.out.println("Collecting odd and even");
        Map<Boolean,List<Integer>> map=numbers.stream().collect(Collectors.partitioningBy(number -> number%2==0));
        System.out.println(map.get(false));
        System.out.println(map.get(true));
    }

}
