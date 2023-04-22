public class Cryptography {
    static char a[]={'a','b','c','d','e','f','g','h','i','j','k','l','m','n','o','p','q','r','s','t','u','v','w','x','y','z'};
    public static void main(String[] args) {
        String s="olssv dvysk";
        for(int i=1;i<=25;i++){
            for(int j=0;j<s.length();j++){
                if(!(s.charAt(j)==' ')){
                    int index=s.charAt(j)-97-i;
                    int current=index%26;
                    if(current<0)
                        current+=26;
                    System.out.print( a[current]);
                }
                else
                    System.out.print(" ");
            }
            System.out.println();
        }
    }   
}