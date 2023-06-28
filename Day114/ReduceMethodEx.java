import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;
public class ReduceMethodEx {
    public static void main(String[] args) {

        List<Integer> list = Arrays.asList(1,3,5,7,9,11,13,15);

        Stream<Integer> stream = list.stream();

        Integer result = stream.map(n->n).reduce(0,Integer::sum);

        System.out.println(result);
    }
}