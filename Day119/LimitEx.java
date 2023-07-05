import java.util.stream.Stream;

class LimitEx{
    public static void main(String[] args){
        Stream<Integer> str=Stream.iterate(1,i->i+1);
        str.limit(10).forEach(System.out::println);
    }
}