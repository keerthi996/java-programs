import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class CollectorsEx {
    public static void main(String[] args) {
        List<Person> people = List.of(
                new Person("John", 25),
                new Person("Alice", 30),
                new Person("Bob", 35)
        );

        Map<String, Integer> nameToAgeMap = people.stream()
                .collect(Collectors.toMap(Person::getName, Person::getAge));

        System.out.println(nameToAgeMap);
    }
}
