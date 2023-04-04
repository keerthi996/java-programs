class EndingWith{
    public static void main(String[] args){
        String str="xxhihdgbxx";
        System.out.println(end(str));
    }
    static String end(String str){
        if(str.length()==0)
        return "";
        if(str.charAt(0)!='x')
        return str.charAt(0)+end(str.substring(1));
        else
        return end(str.substring(1))+"x";
    }
}