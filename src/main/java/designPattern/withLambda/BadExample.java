package designPattern.withLambda;

import java.util.List;

/**
 * Create function which returns total value
 * create function which returns total value of even numbers
 * create function which returns total value of odd numbers
 *
 */
public class BadExample {

    public static int totalValue(List<Integer> numbers){
        int sum=0;
        for(Integer n: numbers){
            sum += n;
        }
        return sum;
    }
    public static int totalEvenValue(List<Integer> numbers){
        int sum=0;
        for(Integer n: numbers){
            if(n%2==0)
            sum += n;
        }
        return sum;
    }
    public static int totalOddValue(List<Integer> numbers){
        int sum=0;
        for(Integer n: numbers){
            if(n%2!=0)
            sum += n;
        }
        return sum;
    }
    public static void main(String[] args) {
        List<Integer> numbers = List.of(1,2,3,4,5,6,7,8,9,10);
        System.out.println(totalValue(numbers));
        System.out.println(totalEvenValue(numbers));
        System.out.println(totalOddValue(numbers));
    }
}
