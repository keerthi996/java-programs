/*
 * The stream(T[] array) method of Arrays class in Java, is used to get a Sequential Stream 
 * from the array passed as the parameter with its elements. It returns a sequential Stream 
 * with the elements of the array, passed as parameter, as its source. 
 */
import java.util.Arrays;
import java.util.stream.*;
class ArrayStreamEx{
    public static void main(String[] args){
        String[] str={"Keerthi","Chinni","Chiiti"};
        Stream<String> stream=Arrays.stream(str);
        stream.forEach(t -> System.out.println(t));
    }
}