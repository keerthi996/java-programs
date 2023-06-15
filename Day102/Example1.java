import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintStream;

public class Example1 {
    public static void main(String[] args)throws IOException {
        Student s1=new Student();
        s1.setName("Keerthi");
        s1.setRollNo(16);;
        s1.setMailId("keerthi@123");
        s1.setPercentage(75.4);
        FileOutputStream fos=new FileOutputStream("Details.txt");
        PrintStream ps=new PrintStream(fos);
        ps.println(s1.getName());
        ps.println(s1.getRollNo());
        ps.println(s1.getMailId());
        ps.println(s1.getPercentage());
        ps.close();
        fos.close();

    }
}
