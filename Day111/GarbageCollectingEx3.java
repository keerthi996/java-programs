import org.w3c.dom.ls.LSOutput;

/*
    Method or Block Scope Exit:
    When an object is created within a method or block, it becomes eligible for garbage
    collection once the method or block execution completes.
 */
public class GarbageCollectingEx3 {
    public static void main(String[] args){
        printObj();

    }
    public static void printObj(){
        Student s=new Student("Keerthi");
        System.out.println(s.toString());
    }
}
