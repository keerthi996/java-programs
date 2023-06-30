import java.util.Arrays;
import java.util.Optional;

class OptionalEx3 {
    public static void main(String[] args) {
        String[] names = {"Keerthi", "Kullay", "Chitti", "Aishu"};
        Optional<String[]> optionalStr = Optional.of(Arrays.stream(names)
                                               .filter(t -> t.startsWith("K"))
                                               .toArray(String[]::new));

        if (optionalStr.isPresent()) {
            String[] filteredArray = optionalStr.get();
            System.out.println("Filtered Array:");
            for (String name : filteredArray) {
                System.out.println(name);
            }
        } else {
            System.out.println("No elements match the condition.");
        }
    }
}
