/*
 * Nullifying References:
   Setting an object reference to null effectively removes the reference to the object, making it 
   eligible for garbage collection.
 */
class GarbageCollectingEx1{
    public static void main(String[] args){
        Student s1=new Student("Keerthi");
        s1=null;
        System.out.println(s1.toString());//it gives null pointer exception



    }
}
class Student{
    private String name;
    Student(String name){
        this.name=name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                '}';
    }
}