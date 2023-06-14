import java.io.IOException;
import java.io.RandomAccessFile;

public class RandomAccessFileEx {
    public static void main(String[] args)throws IOException {
        RandomAccessFile raf=new RandomAccessFile("Hello.txt","rw");
        String s="Hi this a text file";
        byte[] b=s.getBytes();
        raf.write(b);
        raf.seek(0);
        System.out.println((char)raf.read());
        System.out.println(raf.getFilePointer());
        System.out.println(raf.getChannel());
        System.out.println(raf.length());

    }
}
