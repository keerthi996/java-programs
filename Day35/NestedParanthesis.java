class NestedParanthesis{
    static boolean nestParen(String str) {
        int l=str.length();
        if(l==0){
            return true;
        }
        if(l%2==1){
            return false;
        }
        else{
            if(str.charAt(0)=='(' && str.charAt(l-1)==')'){
            return nestParen(str.substring(1,l-1));
            }
            else{
            return false;
            }
        }
    }
    public static void main(String args[]){
        String str="((()))";
        System.out.println(nestParen(str));
    }

}