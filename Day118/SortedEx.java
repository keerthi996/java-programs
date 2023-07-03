import java.util.Arrays;
import java.util.stream.IntStream;

class SortedEx{
    public static void main(String[] args){
        int[] arr={4,7,2,5,6,9,0};
        IntStream ins=Arrays.stream(arr);
        ins.sorted().forEach(System.out::println);
    }
}