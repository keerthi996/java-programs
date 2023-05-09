import java.io.IOError;
import java.io.IOException;
import java.io.PrintWriter;

public class PrintWriterEx2 {
    public static void main(String[] args)throws IOException {
        PrintWriter writer=new PrintWriter("Hello.txt");
        writer.write("Hi...Keerthi");
        writer.flush();
        writer.close();
    }
}
