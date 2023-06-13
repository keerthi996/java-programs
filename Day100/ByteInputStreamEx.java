/*
    Java ByteArrayInputStream class contains an internal buffer which is used to read byte 
    array as stream. In this stream, the data is read from a byte array.
*/
import java.io.*;
class ByteArrayInputStreamEx{
    public static void main(String[] args){
        

        byte byte1[] = {'k','e','e','r','t','h','i'};

        ByteArrayInputStream b = new ByteArrayInputStream(byte1);

        String str = new String(b.readAllBytes());

        System.out.println(str);

    }
}
  
