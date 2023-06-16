import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class ObjectInputStreamEx {
    public static void main(String[] args)throws IOException,ClassNotFoundException {
        FileInputStream fis=new FileInputStream("StudentDetails.txt");
        ObjectInputStream ois=new ObjectInputStream(fis);
        Student s1=(Student)ois.readObject();
        System.out.println(s1.toString());
        ois.close();
        fis.close();


    }
}
