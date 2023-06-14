import java.io.FileWriter;
import java.io.IOException;

public class FileWriterEx {
    public static void main(String[] args)throws IOException {
        FileWriter fw=new FileWriter("Hello.txt",true);
        fw.write("this is addded through file writer");
        fw.close();
    }
}
