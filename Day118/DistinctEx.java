import java.util.stream.*;
class DistinctEx{
    public static void main(String[] args){
        Stream<Integer> str=Stream.of(1,2,3,4,3,4,2,5,6,7,1,3,5,6);
        str.distinct().forEach(System.out::println);
    }
}