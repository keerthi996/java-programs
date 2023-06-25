/*
 * Reassigning References:
    If an object reference is reassigned to another object, the previously referenced object 
    becomes eligible for garbage collection.
 */
class GarbageCollectingEx2{
    public static void main(String[] args){
        Student s1=new Student("Keerthi");
        Student s2=new Student("Thanusha");
        s1=s2;
        System.out.println(s2.toString());
        System.out.println(s1.toString());

    }
}
