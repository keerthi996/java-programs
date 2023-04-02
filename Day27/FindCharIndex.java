//program to find the index of the same character in two strings
class FindCharIndex{
    public static void main(String args[]){
        String s1="book";
        String s2="king";
        for(int i=0;i<s1.length();i++){
            for(int j=0;j<s2.length();j++){
                if(s1.charAt(i)==s2.charAt(j)){
                    System.out.println(j);
                    break;
                }
            }
        }
    }
}