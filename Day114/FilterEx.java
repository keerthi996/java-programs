import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;
public class FilterEx {
    public static void main(String[] args) {

        List<Integer> list = Arrays.asList(32,54,12,7,6,90,42);

        Stream<Integer> stream = list.stream();

        Stream<Integer> list1 = stream.filter(n -> n%3==0);//used to filter the multiples of 3.

        list1.forEach(System.out::println);

    }
}