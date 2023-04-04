class StringCount{
    static int strCount(String str, String sub) {
        int sublen=sub.length();
        if(str.length()<sublen){
            return 0;
        }
        if(str.substring(0,sublen).equals(sub)){
            return 1+strCount(str.substring(sublen),sub);
        }
        else{
            return strCount(str.substring(1),sub);
        }
    }
    public static void main(String args[]){
        String str="catcowcat";
        System.out.println(strCount(str,"cow"));
    }

}