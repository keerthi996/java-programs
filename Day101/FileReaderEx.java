
import java.io.FileReader;
import java.io.IOException;

public class FileReaderEx {
    public static void main(String[] args)throws IOException {
        FileReader fr=new FileReader("Hello.txt");


        System.out.println((char)fr.read());
        fr.close();

    }
}
