//Program for Anagram
import java.util.Arrays;
class Anagram{
    public static void main(String args[]){
        String s1="hello";
        String s2="ellh";
        char[] ch1=s1.toCharArray();
        char[] ch2=s2.toCharArray();
        Arrays.sort(ch1);
        Arrays.sort(ch2);
        int count=0;
        if(ch1.length!=ch2.length){
            System.out.println("Not an anagram");
            return;
        }
        for(int i=0;i<ch1.length;i++){
            if(ch1[i]!=ch2[i]){
                System.out.println("Not an anagram");
                count++;
                break;
            }
        }
        if(count==0){
            System.out.println("Anagram");
        }

    }
}