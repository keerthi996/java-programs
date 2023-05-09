import javax.imageio.IIOException;
import java.io.FileWriter;
import java.io.IOException;

public class FileWriterEx {
    public static void main(String[] args)throws IOException {
        FileWriter fw=new FileWriter("Hello.txt",true);
        fw.write("Hi ...Keerthi");
        fw.append("\nGood Morning");
        System.out.println(fw.getEncoding());
        System.out.println(fw.hashCode());
        fw.flush();
        fw.close();
    }
}
