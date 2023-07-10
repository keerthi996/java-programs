import java.util.stream.Collectors;
import java.util.stream.Stream;

public class CollectorsEx3 {
    public static void main(String[] args) {
        Stream<String> stream = Stream.of("apple", "banana", "cherry");
        String joined = stream.collect(Collectors.joining(", "));
        System.out.println(joined);  // Output: apple, banana, cherry
    }
}
