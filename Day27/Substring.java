//To find Whetehr the second string is substring of first string or not
class Substring{
    public static void main(String args[]){
        String s1="Hello world";
        String s2="llo world";
        for(int i=0;i<s1.length();i++){
            if(s1.charAt(i)==s2.charAt(0)){
                int k=i+1,c=0;
                for(int j=1;j<s2.length();j++){
                    if(s1.charAt(k)!=s2.charAt(j)){
                        c++;
                        break;
                    }
                    k++;
                }
                if(c==0){
                    System.out.println("It is a Substring");
                    return;
                }
            }
        
        }
        System.out.println("NO it is not a substring");
    }
}