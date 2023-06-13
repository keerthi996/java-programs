/*
The CharArrayReader is composed of two words: CharArray and Reader.
 The CharArrayReader class is used to read character array as a reader (stream).
  It inherits Reader class.
*/
import java.io.CharArrayReader;  

public class CharArrayReaderEx {  
  public static void main(String[] ag) throws Exception {  

    char[] ch = { 'k', 'e', 'e', 'r','t','h','i'};  

    CharArrayReader reader = new CharArrayReader(ch);  

    int i=0; 

    while ((i = reader.read()) != -1) {  

       System.out.print((char)i);

    }  
  }  
} 