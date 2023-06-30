/*
    Stream.of() is generic whereas Arrays.stream is not: Arrays.stream() method only works for
    primitive arrays of int[], long[], and double[] type, and returns IntStream, LongStream and
    DoubleStream respectively. For other primitive types, Arrays.stream() won’t work. On the other
    hand, Stream.of() returns a generic Stream of type T (Stream). Hence, it can be used with any
        type.
*/
import java.util.*;
import java.util.stream.*;

class DifferenceEx2 {
    public static void main(String[] args) {
        char[] arr = { '1', '2', '3', '4', '5' };
        IntStream cStream = new String(arr).chars();

        Stream<Object> stream = Stream.of('k', 16, "Keerthi");
        stream.forEach(t -> System.out.println(t));
    }
}

