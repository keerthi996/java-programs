class StringCleaning{
    public static void main(String[] args){
        String str="hbdchhcshc";
        System.out.println(clean(str));
    }
    static String clean(String str){
        if(str.length()<2)
        return str;
        if(str.charAt(0)==str.charAt(1))
        return clean(str.substring(1));
        return str.charAt(0)+clean(str.substring(1));
    }
}