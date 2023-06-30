/*
The Stream of(T… values) returns a sequential ordered stream whose elements are the specified
 values. Stream.of() method simply calls the Arrays.stream() method for non-primitive types. 
*/
import java.util.stream.*;
class StreamOfEx{
    public static void main(String[] args){
        Stream stream=Stream.of("Keerthi",16,"Chitti","Thanusha");
        stream.forEach(t->System.out.println(t));
    }
}