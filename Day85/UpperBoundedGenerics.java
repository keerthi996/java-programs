//u can allow only certain types 
/* Upper bounded generics restrict the type argument to be a subtype of a specified class or interface.

It is denoted using the extends keyword followed by the upper bound type.

For example, T extends MyClass restricts the type argument T to be a subtype of MyClass. */
import java.util.*;
class UpperBoundedGenerics{
    public static void main(String[] args){
        List<Integer> list=new ArrayList<Integer>();
        list.add(10);
        list.add(10);
        list.add(10);
        int sum=sumOfList(list);
        System.out.println(sum);
    }
    public static <T extends Number> int sumOfList(List<T> list) {
        int sum = 0;
        for (T element : list) {
            sum += element.doubleValue();
        }
        return sum;
    }
    
}