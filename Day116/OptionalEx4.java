import java.util.Arrays;
import java.util.Optional;

class OptionalEx3 {
    public static void main(String[] args) {
        String[] names = {"Keerthi", "Kullay", "Chitti", "Aishu"};
        Optional<String[]> optionalStr = Optional.ofNullable(names);

        Optional<String[]> filteredStr = optionalStr.filter(value ->
                Arrays.stream(value).allMatch(element -> element.startsWith("K")));

        if (filteredStr.isPresent()) {
            String[] filteredArray = filteredStr.get();
            System.out.println("Filtered Array:");
            for (String name : filteredArray) {
                System.out.println(name);
            }
        } else {
            System.out.println("Array is null or no elements match the condition.");
        }
    }
}
