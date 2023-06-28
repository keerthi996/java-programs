import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;
public class MapEx {
    public static void main(String[] args) {

        List<Integer> list = Arrays.asList(10,20,30,40,50);

        Stream<Integer> stream = list.stream();

        stream.map(n->n*n).forEach(System.out::println);
    }
}