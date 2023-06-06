@FunctionalInterface
interface Student{

    void hello(String str);

}
class MethodReferenceEx2{
    public static void main(String[] args) {

        Student  s = new Name()::hello; 
        s.hello("keerthi"); 
        
    }
}
class Name{

    public void hello(String str) {

        System.out.println(str);

        System.out.println(str.toUpperCase());

        

    }
}