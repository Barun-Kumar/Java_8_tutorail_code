package comparator;

import java.util.Comparator;

public class ComparatorTest {
    public static void main(String[] args) {
        //Before
        Comparator<Integer> comparator = new Comparator<>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return o1.compareTo(o2);
            }
        };

        System.out.println( comparator.compare(2,2));

        //After
        Comparator<Integer> c= (first,second)->  first.compareTo(second);
        System.out.println(c.compare(2,2));
    }
}
