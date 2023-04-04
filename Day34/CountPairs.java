class CountPairs{
    public static void main(String[] args){
        String str="axaxsxdscxsx";
        System.out.println(count(str));
    }
    static int count(String str){
        if(str.length()<3)
        return 0;
        if(str.charAt(0)==str.charAt(2))
        return 1+count(str.substring(1));
        return count(str.substring(1));
    }
}