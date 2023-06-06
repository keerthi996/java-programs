@FunctionalInterface
interface Student{

    void hello(String str);

}
class MethodReferenceEx1{
    public static void main(String[] args) {

        Student  s = Name::hello; 
        s.hello("keerthi"); 
        
    }
}
class Name{

    public static void hello(String str) {

        System.out.println(str);

        System.out.println(str.toUpperCase());

        

    }
}