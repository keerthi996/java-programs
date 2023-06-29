/*  In Java, the term "consumer interface" typically refers to the Consumer interface provided by
    the Java 8's functional programming features. The Consumer interface represents an operation
    that takes in a single input argument and returns no result. It is part of the java.util.
    function package.
*/
import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class ConsumerEx1 {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("Alice", "Bob", "Charlie", "Dave");

        // Define a Consumer to print the names
        Consumer<String> printConsumer = name -> System.out.println(name);

        // Use the Consumer to process each name in the list
        names.forEach(printConsumer);
    }
}
