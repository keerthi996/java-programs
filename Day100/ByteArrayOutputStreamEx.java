import java.io.*;  

public class ByteArrayOutputStreamEx {  
public static void main(String args[])throws Exception {

      FileOutputStream fout1 = new FileOutputStream("First.txt");    

      FileOutputStream fout2 = new FileOutputStream("Second.txt");    
        
      ByteArrayOutputStream bout = new ByteArrayOutputStream(); 

      bout.write(75); 

      bout.writeTo(fout1);  

      bout.writeTo(fout2);  
        
      bout.flush(); 

      bout.close();

    }
         
}   