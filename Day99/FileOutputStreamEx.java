/*
 * Java FileOutputStream is an output stream used for writing data to a file.

    If you have to write primitive values into a file, use FileOutputStream class. 
    You can write byte-oriented as well as character-oriented data through FileOutputStream class. 
    But, for character-oriented data, it is preferred to use FileWriter than FileOutputStream. 
 */
import java.io.FileOutputStream;
import java.io.IOException;
class FileOutputStreamEx{
    public static void main(String[] args)throws IOException{
        FileOutputStream fos=new FileOutputStream("Hello.txt",true);
        String s="How are You?";
        byte[] b=s.getBytes();
        fos.write(b);
        fos.close();
        
    }
}