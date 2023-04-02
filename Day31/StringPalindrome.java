class StringPalindrome{
    public static void main(String[] args){
        String str="madam";
        System.out.print(pal(str));

    }
    static boolean pal(String str){
        int len=str.length();
        if(len==0||len==1)
        return true;
        if(str.charAt(0)!=str.charAt(len-1))
        return false;
        return pal(str.substring(1,len-1));
    }
}
