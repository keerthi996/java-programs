import java.util.*;
public class Stackex1 {
    public static void main(String[] args){
        Stack<Integer> s1=new Stack<>();
        s1.push(9);
        s1.push(8);
        s1.push(7);
        s1.push(6);
        System.out.println(s1.search(8));
        System.out.println(s1.capacity());
        System.out.println(s1.empty());
        System.out.println(s1.indexOf(7));
        System.out.println(s1.isEmpty());
        System.out.println(s1.size());
        System.out.println(s1.toArray());
        System.out.println(s1.get(3));
        

    }
    
}
