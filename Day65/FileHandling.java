import java.io.File;

public class FileHandling {
    public static void main(String[] args){
        File f1=new File("Hello.txt");
        try{
            f1.createNewFile();
            System.out.println("File created");
        }
        catch (Exception e){
            System.out.println(e);
        }
        System.out.println(f1.exists());
        System.out.println(f1.getAbsolutePath());
        System.out.println(f1.getName());
        System.out.println(f1.getParent());
        System.out.println(f1.getPath());
        f1.delete();
    }
}
