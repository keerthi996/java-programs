public class GarbageCollectorEx {
    public static void main(String[] args) {
        Student s1 = new Student(16, "Keerthi");
        s1.get();
        Student s2 = new Student(24, "Thanusha");
        s2.get();
        Student s3 = new Student(36, "Shashank");
        s3.get();
        s3 = s2;
        s2 = s1;
        s3.get();
    }
}
class Student{
    int rollNo;
    String name;
    Student(int rollNo,String name) {
        this.rollNo=rollNo;
        this.name=name;
    }
    public void get() {
        System.out.println("roll number : "+rollNo);
        System.out.println("name : "+name);
    }
}