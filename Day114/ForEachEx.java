import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.stream.Stream;
public class ForEachEx {
    public static void main(String[] args) {

        List<Integer> list = Arrays.asList(1,2,3,4,5);

        Stream<Integer> stream = list.parallelStream();
        Consumer<Integer> consumer = new Consumer<Integer>() {
            @Override
            public void accept(Integer integer) {
                System.out.println("items "+integer);
            }
        };
        stream.forEachOrdered(consumer);
    }
}