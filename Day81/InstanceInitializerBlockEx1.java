/*Instance Initializer block is used to initialize the instance data member. It run each time when object of the class is created. 
There are mainly three rules for the instance initializer block. They are as follows:

    The instance initializer block is created when instance of the class is created.
    The instance initializer block is invoked after the parent class constructor is invoked (i.e. after super() constructor call).
    The instance initializer block comes in the order in which they appear.
*/
class InstanceInitializerBlockEx1{
    public static void main(String[] args){
        Student s1=new Student();
        Student s2=new Student();
    }
}
class Student{
    String name;
    Student(){
        System.out.println("Name is:"+name);
    }
    {name="Keerthi";}
}