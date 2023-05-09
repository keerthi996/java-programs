//try with resource feature in java does not reqire file writer and printWriter class to call flush and close methods
import java.io.FileWriter;
import java.io.IOException;

public class TryWithResource {
    public static void main(String[] args)throws IOException {
        try(FileWriter fw=new FileWriter("Hello.txt",true);){
            fw.write("Trying to learn java");

        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
