import java.io.PrintWriter;

public class PrintWriterEx {
    public static void main(String[] args){
        PrintWriter writer=new PrintWriter(System.out);
        writer.write("Hi....Hello...Good morning");
        writer.flush();
        writer.close();

    }
}
