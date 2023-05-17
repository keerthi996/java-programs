/*The primary purpose of the toString() method is to provide a human-readable string 
    representation of an object's state. It is good practice to override toString() in 
    your custom classes to provide meaningful information that aids in understanding and debugging 
    your code.
*/
class ToStringEx{
    public static void main(String[] args){
        Person p1=new Person("Keerthi",22);
        System.out.println(p1.toString());
        
        
    }
}
class Person{
    private String name;
    private int age;
    Person(String name,int age){
        this.name=name;
        this.age=age;
    }
    @Override
    public String toString(){
        return "person:"+name+", Age:"+age;
    }
}