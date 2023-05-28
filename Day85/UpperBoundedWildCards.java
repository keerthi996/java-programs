/*In Java, wildcards are used as a part of the generics feature to provide flexibility when
 working with generic types.
 There are two types of wildcards in Java: the upper bounded wildcard and the unbounded wildcard.

    Upper Bounded Wildcards:
    An upper bounded wildcard is denoted by the ? extends Type syntax. It allows you to specify that the generic type can be any type that is a subtype of the specified type.
*/
import java.util.*;
class UpperBoundedWildCards{
    public static void main(String[] args){
        List<Integer> lst1=new ArrayList<>();
        lst1.add(12);
        lst1.add(34);
        lst1.add(65);
        System.out.println(addition(lst1));
    }
    public static double addition(List<? extends Number> numbers){
        double sum=0.0;
        for(Number num:numbers){
            sum=sum+num.doubleValue();
        }
        return sum;
    }
}
