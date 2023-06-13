

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.SequenceInputStream;

class SequenceInputStreamEx1{
    public static void main(String[] args)throws IOException{
        
        FileInputStream fis1=new FileInputStream("First.txt");
        FileInputStream fis2=new FileInputStream("Second.txt");
        SequenceInputStream sis=new SequenceInputStream(fis1, fis2);
        FileOutputStream fos=new FileOutputStream("Result.txt");
        int i;
        while((i=sis.read())!=-1){
            fos.write(i);
        }
        
        fis1.close();
        fis2.close();
        sis.close();


    }
}