import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class ObjectOutputStreamEx {
    public static void main(String[] args)throws IOException {
        FileOutputStream fos=new FileOutputStream("StudentDetails.txt");
        ObjectOutputStream oos=new ObjectOutputStream(fos);
        Student s1=new Student();
        s1.setName("Keerthi");
        s1.setRollNo(16);
        s1.setMailId("keerthi@123");
        s1.setPercentage(75.4);
        oos.writeObject(s1);
        oos.close();
        fos.close();

    }
}
