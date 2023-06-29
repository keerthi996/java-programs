import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

public class ConsumerEx3 {
    public static void main(String[] args) {
        List<String> names = List.of("Keerthi", "Chitti", "Chinni","Chinna");

        
        List<String> cNames = new ArrayList<>();
        Consumer<String> sorted = n-> {
            if (n.startsWith("C")) {
                cNames.add(n);
            }
        };

        
        names.forEach(sorted);

        System.out.println("Collected fruits: " + cNames);
    }
}
