/*
The CharArrayWriter class can be used to write common data to multiple files. This class inherits Writer class. Its buffer automatically grows when data is written in this stream. Calling the close() method on this object has no effect.
*/
import java.io.*;
class CharArrayWriterEx{
    public static void main(String[] args)throws IOException{
        CharArrayWriter caw=new CharArrayWriter();
        caw.write("this is the line added through charArryWriter");
        FileWriter f1=new FileWriter("First.txt",true);
        FileWriter f2=new FileWriter("Second.txt",true);
        caw.writeTo(f1);
        caw.writeTo(f2);
        f1.close();
        f2.close();


    }
}
