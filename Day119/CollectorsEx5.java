import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class CollectorsEx5{
    public static void main(String[] args) {
        Stream<String> stream = Stream.of("apple", "banana", "cherry", "grape");
        Map<Boolean, List<String>> map = stream.collect(Collectors.partitioningBy(s -> s.length() > 5));
        System.out.println(map);  // Output: {false=[apple], true=[banana, cherry, grape]}
    }
}
