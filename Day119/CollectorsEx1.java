import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class CollectorsEx1 {
    public static void main(String[] args) {
        Stream<String> stream = Stream.of("apple", "banana", "cherry");
        List<String> list = stream.collect(Collectors.toList());
        System.out.println(list);  // Output: [apple, banana, cherry]
    }
}
