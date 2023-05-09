import java.io.FileReader;
import java.io.IOException;

public class FileReaderEx {
    public static void main(String[] args)throws IOException {
        FileReader reader=new FileReader("Hello.txt");
        System.out.println(reader.read());
        reader.close();
    }
}
