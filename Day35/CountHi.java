class CountHi{
    static int countHi2(String str) {
        if(str.length()<2){
            return 0;
        }
        if(str.charAt(0)=='x' && str.charAt(1)=='h'){
            return countHi2(str.substring(2));
        }
        if(str.charAt(0)=='h' && str.charAt(1)=='i'){
            return 1+countHi2(str.substring(1)); 
        }
        else{
            return countHi2(str.substring(1));
        }
    }
    public static void main(String args[]){
        String str="xhihihix";
        System.out.println(countHi2(str));
    }
}