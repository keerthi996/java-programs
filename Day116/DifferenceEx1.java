/*
 * Different return types: For primitives arrays (like int[], long[] etc), Arrays.stream() 
 * and Stream.of() have different return types. Example: Passing an integer array, the 
 * Stream.of() method returns Stream whereas Arrays.stream() returns an IntStream. 
 */

 /*
  * Stream.of() needs flattening whereas Arrays.stream() does not: As the ideal class used for
   processing of Streams of primitive types are their primitive Stream types (like IntStream,
    LongStream, etc). Therefore Stream.of() needs to be explicitly flattened into its primitive 
    Stream before consuming.
  */
import java.util.*;
import java.util.stream.*;
class DifferenceEx1{
    public static void main(String[] args){
        int[] nums={1,2,3,4,5,6};
        IntStream inStream=Arrays.stream(nums);

        inStream.forEach(t->System.out.println(t));

        //Convert array into stream using stream.of() method

        Stream<int[]> stream=Stream.of(nums);
        //Flatenning
        IntStream intStream=stream.flatMapToInt(Arrays::stream);

        intStream.forEach(t->System.out.println(t));



    }
}