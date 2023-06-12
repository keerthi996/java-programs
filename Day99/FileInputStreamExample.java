/*
Java FileInputStream class obtains input bytes from a file. It is used for reading byte-oriented data (streams of raw bytes) such as image data, audio, video etc. You can also read character-stream data. But, for reading streams of characters, it is recommended to use FileReader class.
*/
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Arrays;
class FileInputStreamExample{
    public static void main(String[] args)throws IOException{
        FileInputStream fis=new FileInputStream("Hello.txt");
        byte[] arr=new byte[fis.available()];
        System.out.println(fis.available());
        System.out.println(fis.read(arr, 0, 3));
        System.out.println(fis.available());
        System.out.println(Arrays.toString(arr));
        fis.close();
    }
}