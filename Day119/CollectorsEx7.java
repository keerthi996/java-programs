import java.util.stream.Collectors;
import java.util.stream.Stream;

public class CollectorsEx7 {
    public static void main(String[] args) {
        Stream<Integer> stream = Stream.of(1, 2, 3, 4, 5);
        int sum = stream.collect(Collectors.summingInt(i -> i));
        System.out.println(sum);  // Output: 15
    }
}
