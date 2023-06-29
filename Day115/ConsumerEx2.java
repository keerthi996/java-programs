import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

public class ConsumerEx2 {
    public static void main(String[] args) {
        List<Integer> numbers = new ArrayList<>(List.of(1, 2, 3, 4, 5));

        // Define a Consumer to update each number to its square
        Consumer<Integer> squareConsumer = n -> {
            int square = n * n;
            System.out.println("Square of " + n + " is " + square);
        };

        // Use the Consumer to update each number in the list
        numbers.forEach(squareConsumer);
    }
}
