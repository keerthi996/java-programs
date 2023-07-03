import java.util.stream.*;
class SkipExample{
    public static void main(String[] args){
        Stream<Integer> s1=Stream.of(1,2,3,4,5,6,7,8,9);
        Stream<Integer> skippedNumbers = s1.skip(5);
        skippedNumbers.forEach(System.out::println);

    }
}