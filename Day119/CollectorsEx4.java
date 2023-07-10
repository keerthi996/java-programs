import java.util.stream.Collectors;
import java.util.stream.Stream;

public class CollectorsEx4 {
    public static void main(String[] args) {
        Stream<Integer> stream = Stream.of(1, 2, 3, 4, 5);
        double average = stream.collect(Collectors.averagingDouble(i -> i));
        System.out.println(average);  // Output: 3.0
    }
}
