//Decryption
class Decryption{
    public static void main(String args[]){
        String s="jk";
        int key=2;
        String cipher="";
        char a[]={'a','b','c','d','e','f','g','h','i','j','k','l','m','n','o','p','q','r','s','t','u','v','w','x','y','z'};
        for(int i=0;i<s.length();i++){
            if(!(s.charAt(i)==' ')){
                int index=s.charAt(i)-97;
                cipher=cipher.concat(String.valueOf(a[index-key]));
            }
        }
        System.out.println(cipher);
    }
}