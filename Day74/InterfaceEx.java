/*Interfaces specify what a class must do and not how. It is the blueprint of the behaviour.
    Interface do not have constructor. 
    *Like a class, an interface can have methods and variables, but the methods declared in an 
        interface are by default abstract (only method signature, no body).
    *In an interface, you can’t instantiate variables and create an object.
    **In Java, multiple inheritances is not allowed, however, you can use an interface 
            to make use of it as you can implement more than one interface.
*/
/*1. Prior to JDK 8, the interface could not define the implementation. 
        We can now add default implementation for interface methods. 
        This default implementation has a special use and does not affect the intention behind
        interfaces.

Suppose we need to add a new function in an existing interface. Obviously, the old code will not work as the classes have not implemented those new functions. So with the help of default implementation, we will give a default body for the newly added functions.
 Then the old codes will still work. */
class InterfaceEx{
    public static void main(String[] args){
       Student s1=new Student();
       s1.wish();
       System.out.println(s1.add(5,4));


    }
}
interface Inter1{
    public void wish();
}
interface Inter2 extends Inter1{
    public int add(int a,int b);
}
class Student implements Inter2{
    
    public void wish(){
        System.out.println("HI...GoodMorning");
    }
    public int add(int a,int b){
        return a+b;
    }
}