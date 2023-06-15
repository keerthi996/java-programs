import java.io.DataOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

public class Example2 {
    public static void main(String[] args)throws IOException {
        FileOutputStream fos=new FileOutputStream("Details.txt");
        DataOutputStream dos=new DataOutputStream(fos);
        Student s3=new Student();
        s3.setName("Shashank");
        s3.setRollNo(45);
        s3.setMailId("shashank@123");
        s3.setPercentage(89.45);
        dos.writeUTF(s3.getName());
        dos.writeInt(s3.getRollNo());
        dos.writeUTF(s3.getMailId());
        dos.writeDouble(s3.getPercentage());
        dos.close();
        fos.close();



    }
}
