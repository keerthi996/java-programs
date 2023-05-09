import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class ScannerEx {
    public static void main(String[] args)throws IOException {
        File f=new File("Hello.txt");
        Scanner s=new Scanner(f);
        while(s.hasNextLine()){
            System.out.println(s.next());

        }



    }
}
