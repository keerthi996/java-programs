//to find number of integers present in a string
class CountNumbers{
    public static void main(String args[]){
        String s="345hmjlei";
        int count=0;
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)>=48 && s.charAt(i)<=57){
                count++;
            }
        }
        System.out.println("Number of digits in a given sring is :"+count);
        
    }
}