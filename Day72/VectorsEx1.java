//Different methods of initializing a vector
import java.util.*;
class VectorsEx1{
    public static void main(String[] args){
        Vector<Integer> v1=new Vector<>();//It takes only integer elements
        Vector v2=new Vector();//default vector which takes different datatype elements
        Vector v3=new Vector(5);
        Vector<String> v4 = new Vector<String>(2,5);//here 2 is the initial capacity and 5 is the increment 
        System.out.println(v1.capacity());//initially it takes 10 as default capacity
        System.out.println(v4.capacity());
        v4.add("Hi");
        System.out.println(v4);
        


    }
}