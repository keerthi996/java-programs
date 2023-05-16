/*1. Prior to JDK 8, the interface could not define the implementation. 
        We can now add default implementation for interface methods. 
        This default implementation has a special use and does not affect the intention behind
        interfaces.

        Suppose we need to add a new function in an existing interface. Obviously, 
        the old code will not work as the classes have not implemented those new functions. So with the help of default implementation, we will 
        give a default body for the newly added functions.
        Then the old codes will still work. 
 
 */
class InterfaceEx1{
        public static void main(String[] args){
            Animal a=new Animal();
            a.display();;
            a.eat();

        }
}
interface Lion {
    default void display(){
        System.out.println("Hii...hello");
    }

    public void eat();
    
}
interface Bird extends Lion {  

    public void fly();
}
class Animal implements Bird {

        public void eat() {

            System.out.println("Lion eats Deer");
        }
        public void fly() {

            System.out.println("Bird flies in the sky");
        }
}