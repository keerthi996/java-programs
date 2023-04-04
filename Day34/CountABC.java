//count number of abc's  or aba's present in given string
class CountABC{
    public static void main(String[] args){
        String str="abcxxcanbjkdcbaba";
        System.out.println(count(str));
    }
    static int count(String str){
        if(str.length()<=2)
        return 0;
        if(str.substring(0,3).equals("abc")||str.substring(0,3).equals("aba"))
        return 1+count(str.substring(2));
        return count(str.substring(1));
    }
}