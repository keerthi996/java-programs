import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class CollectorsEx2 {
    public static void main(String[] args) {
        Stream<String> stream = Stream.of("apple", "banana", "cherry");
        Set<String> set = stream.collect(Collectors.toSet());
        System.out.println(set);  // Output: [apple, banana, cherry]
    }
}
