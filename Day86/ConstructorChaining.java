/*Constructor chaining in Java is the process of calling one constructor from another 
    constructor within the same class or between parent and child classes. This allows for code 
    reuse and initialization of objects in a more flexible manner. 
*/

class ConstructorChaining{
    public static void main(String[] args){
        Student s1=new Student();
    }
}
class Student{
    Student(){
        this("Keerthi");

        System.out.println("Constructor without arguments");

    }
    Student(String name){
        this("Keerthi",16);
        System.out.println(name);
        System.out.println("Single parameter constructor");
    }
    Student(String name,int rollno){
        System.out.println(name+" "+rollno);
        System.out.println("Constructor with 2 parameters");
    }
}