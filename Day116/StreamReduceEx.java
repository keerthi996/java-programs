import java.util.Arrays;
import java.util.Optional;

class StreamReduceEx{
    public static void main(String[] args) {
        String[] names = {"Keerthi", "Kullay", "Chitti", "Aishu"};
        Optional<String> longestString = Arrays.stream(names)
                 .reduce((word1, word2)-> word1.length() > word2.length() ? word1 : word2);
        longestString.ifPresent(System.out::println);
    }
}