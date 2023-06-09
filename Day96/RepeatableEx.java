@Student(name = "Keerthi", rollNo = 16, mailId = "keerthi@123")
@Student(name = "Thanusha", rollNo = 26, mailId = "thanusha@123")
@Student(name = "Shashank", rollNo = 36, mailId = "shashank@123")
public class RepeatableEx {
    public static void main(String[] args) {
        Student[] students = RepeatableEx.class.getAnnotationsByType(Student.class);
        for (Student student : students) {
            System.out.println("Name is: " + student.name());
            System.out.println("RollNo is: " + student.rollNo());
            System.out.println("Email id is: " + student.mailId());
            System.out.println();
        }
    }
}