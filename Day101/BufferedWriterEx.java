import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class BufferedWriterEx {
    public static void main(String[] args)throws IOException {
        FileWriter fw=new FileWriter("Hello.txt");
        BufferedWriter bw=new BufferedWriter(fw);
        bw.write("Hi this line is added through buffered writer");
        bw.close();
        fw.close();

    }
}
