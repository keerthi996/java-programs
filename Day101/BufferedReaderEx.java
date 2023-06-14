import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

/*
    Java BufferedReader class is used to read the text from a character-based input stream.
     It can be used to read data line by line by readLine() method. It makes the
     performance fast. It inherits Reader class.
 */
public class BufferedReaderEx {
    public static void main(String[] args)throws IOException {
        FileReader fr=new FileReader("Hello.txt");
        BufferedReader br=new BufferedReader(fr);
        System.out.println(br.readLine());
        System.out.println(br.lines());
        System.out.println(br.markSupported());
        br.skip(0);
        System.out.println((char) br.read());

    }
}
