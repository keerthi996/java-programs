/*Encapsulation:
-------------
    Encapsulation means wrapping of code and data together into a single unit .
    data members are private and can be accessed using setter and getter public methods.
    Advantages:
        1.It provides control over the data.
        2.It provides a way to achieve data hiding.
        3.easy and fast to create and test Encapsulated class.
*/
class Example{
    private String name;
    private int age;
    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name=name;
    }
    public int getAge(){
        return age;
    }
    public void setAge(int age){
        this.age=age;
    }

}
class Encapsulation{
    public static void main(String args[]){
        Example e=new Example();
        e.setName("Keerthi");
        e.setAge(22);
        System.out.println("Name is:"+e.getName());
        System.out.println("Age is:"+e.getAge());
    }
}



