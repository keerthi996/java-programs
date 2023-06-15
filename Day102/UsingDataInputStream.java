import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.IOException;

public class UsingDataInputStream {
    public static void main(String[] args) throws IOException {
        FileInputStream fis = new FileInputStream("Details.txt");
        DataInputStream dis = new DataInputStream(fis);


        System.out.println(dis.readUTF());
        System.out.println(dis.readInt());
        System.out.println(dis.readUTF());
        System.out.println(dis.readDouble());

        dis.close();
        fis.close();
    }
}
