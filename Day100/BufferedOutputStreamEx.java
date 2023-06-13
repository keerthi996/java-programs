import java.io.*;  
public class BufferedOutputStreamEx{    
public static void main(String args[])throws IOException {    

     FileOutputStream fout=new FileOutputStream("First.txt");    

     BufferedOutputStream bout=new BufferedOutputStream(fout);   

     String s="hello...keerthi";

     byte b[]=s.getBytes(); 

     bout.write(b);   

     bout.flush(); 

     bout.close();  

     fout.close();     
   
    }    
} 