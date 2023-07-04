import java.util.stream.*;
class ConcatEx{
    public static void main(String[] args){
        Stream<Integer> str1=Stream.of(1,2,3,4,3,4,2,5,6);
        Stream<Integer> str2=Stream.of(9,7,18,16);
        Stream.concat(str1, str2).distinct().forEach(element->System.out.println(element));

    }
}