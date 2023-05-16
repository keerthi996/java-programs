//Paasing object to java
import java.util.Stack;
class StackEx2{
    public static void main(String[] args){
        Stack<Student> stack=new Stack<>();
        Student s1=new Student();
        s1.name="Keerthi";
        s1.marks=95;
        stack.push(s1);
        System.out.println(stack);
        


    }
}
class Student{
    String name;
    int marks;
    @Override
    public String toString(){
        return "name:"+name+", marks:"+marks;
    }
}
