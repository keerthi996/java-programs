import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;

public class UsingBufferedReader {
    public static void main(String[] args)throws IOException {
        FileInputStream fis=new FileInputStream("Details.txt");
        BufferedReader br=new BufferedReader(new InputStreamReader(fis));
        System.out.println("name is:"+br.readLine());
        System.out.println("rollNo is:"+ br.readLine());
        System.out.println("mailID is:"+br.readLine());
        System.out.println("Percentage is:"+br.readLine());
        br.close();
        fis.close();
        fis=new FileInputStream("Details.txt");
        br=new BufferedReader(new InputStreamReader(fis));
        Student s2=new Student();
        s2.setName(br.readLine());
        s2.setRollNo(Integer.parseInt(br.readLine()));
        s2.setMailId(br.readLine());
        s2.setPercentage(Double.parseDouble(br.readLine()));
        System.out.println(s2.toString());
        br.close();
        fis.close();

    }
}
