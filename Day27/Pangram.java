//to verify whether a given string is pangram or not
class Pangram{
    public static void main(String args[]){
        String s="qwertyuiopasdfghjklzxcvbnmqdgn1234";
        s=s.toLowerCase();
        int count=0;
        for(char ch='a';ch<='z';ch++){
            if(!s.contains(String.valueOf(ch))){
                count++;
                break;
            }
        }
        if(count==0){
            System.out.println("Pangram");
        }

    }
}