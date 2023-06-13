/*
SequenceInputStream class is used to read data from multiple streams. 
It reads data sequentially (one by one).
*/

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.SequenceInputStream;

class SequenceInputStreamEx{
    public static void main(String[] args)throws IOException{
        FileOutputStream fos1=new FileOutputStream("First.txt", true);
        FileOutputStream fos2=new FileOutputStream("Second.txt", true);
        String s1="Hi...this is first text file.";
        byte[] b1=s1.getBytes();
        String s2="Hi...this is second tex file.";
        byte[] b2=s2.getBytes();
        fos1.write(b1);
        fos2.write(b2);
        FileInputStream fis1=new FileInputStream("First.txt");
        FileInputStream fis2=new FileInputStream("Second.txt");
        SequenceInputStream sis=new SequenceInputStream(fis1, fis2);
        int i=0;
        while((i=sis.read())!=-1){
            System.out.print((char)i);
        }
        fos1.close();
        fos2.close();
        fis1.close();
        fis2.close();
        sis.close();


    }
}