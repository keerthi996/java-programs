//initializer block will exute first and the constructer will be invoked
class InstanceInitializerBlockEx2{
    public static void main(String[] args){
        
        Student s=new Student();
    }
}
class Student{
    
    Student(){
        System.out.println("Constructor invoked...");
    }
    {
        System.out.println("Initializer block...");
    }
}