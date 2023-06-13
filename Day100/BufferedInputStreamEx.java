import java.io.*;  
public class BufferedInputStreamEx {    
  public static void main(String args[]) throws IOException{    
  
    

      FileInputStream fin=new FileInputStream("Result.txt");    

      BufferedInputStream bin=new BufferedInputStream(fin);  

      int i;    

      while((i=bin.read())!=-1) {

        System.out.print((char)i);   

      }    

      bin.close(); 

      fin.close(); 

    

  } 

}  