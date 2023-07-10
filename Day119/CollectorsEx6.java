import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class CollectorsEx6 {
    public static void main(String[] args) {
        Stream<String> stream = Stream.of("apple", "banana", "cherry", "grape");
        Map<Character, List<String>> map = stream.collect(Collectors.groupingBy(s -> s.charAt(0)));
        System.out.println(map);  // Output: {a=[apple], b=[banana], c=[cherry], g=[grape]}
    }
}
