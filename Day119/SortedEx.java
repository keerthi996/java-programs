import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class SortedEx {
    public static void main(String[] args){
        Stream<String> names=Stream.of("Keerthi","Thanusha","Aishu","shashank");
        List<String> show
                = names.sorted().collect(Collectors.toList());
        System.out.println(show);
    }
}
