//count unique and duplicate  characters in a string
import java.util.Arrays;
class Unique{
    public static void main(String args[]){
        String s="keerthi kudumula";
        String s1= s.replaceAll("\\s+", "");
        char[] ch=new char[s1.length()];
        int unique=0;
        int duplicate=0;
        for(int i=0;i<s1.length();i++){
            int count=0;
            for(int j=0;j<s1.length();j++){
                if(s1.charAt(i)==ch[j]){
                    count++;
                    duplicate++;
                }
            }
            if(count==0){
                ch[unique]=s1.charAt(i);
                unique++;
            }
        }
        System.out.println(Arrays.toString(ch));
        System.out.println(unique);
        System.out.println(duplicate);

    }
}