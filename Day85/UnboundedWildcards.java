/*Unbounded Wildcards:
    An unbounded wildcard is denoted by the ? symbol. It allows you to specify that the 
    generic type can be any type.
*/
import java.util.*;
class UnboundedWildcards{
    public static void main(String[] args){
        List<Integer> lst1=new ArrayList<>();
        lst1.add(12);
        lst1.add(34);
        lst1.add(65);
        display(lst1);
    }
    public static void display(List<?> elements){
        for(Object e:elements){
            System.out.println(e);
        }
    }
}