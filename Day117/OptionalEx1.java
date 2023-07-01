/*
The Optional class in Java is a container object that may or may not contain a non-null value. 
It is part of the java.util package and was introduced in Java 8 as a way to handle nullable
 values more effectively and reduce the occurrence of null pointer exceptions.
*/

import java.util.Optional;

class OptionalEx1{
    public static void main(String[] args){
        String str=null;

        //Creating an empty Optional
        Optional<String> optStr=Optional.empty();

        //Optional that may hold a null value
        optStr.ofNullable(str);

        if(optStr.isPresent()){
            System.out.println(str.length());
        }
        else{
            System.out.println("It contains null value");
        }

    }
}