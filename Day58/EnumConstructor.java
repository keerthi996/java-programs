enum Students{
    KEERTHI(),
    YASHU("yashu"),
    HARIKA("Harika","harika@123");
    Students(){
        
    }
    Students(String s){
        System.out.println("My name is "+s);
    }
    Students(String s,String t){
        System.out.println("My name is "+s);
        System.out.println("My mail id is "+t);
    }
}
public class EnumConstructor{
    public static void main(String args[]){
        var s=Students.HARIKA;
        System.out.println(s);
    }
}
    