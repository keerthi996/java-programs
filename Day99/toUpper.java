import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

class toUpper{
    public static void main(String[] args)throws IOException{
        FileInputStream fis=new FileInputStream("Hello.txt");
        int i=0;
        String s="";
        while((i=fis.read())!=-1){
            s=s+(char)i;
        }
        System.out.println(s);
        fis.close();
        FileOutputStream fos=new FileOutputStream("Hello.txt");
        s=s.toUpperCase();
        byte[] b=s.getBytes();
        fos.write(b);
        fos.close();


    }
}