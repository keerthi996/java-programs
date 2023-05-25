/*isBlank() is an instance method that returns true if the string is empty or contains only white space codepoints. This method was introduced in Java 11.

If the string contains only white spaces, then applying this method will return true.
*/
class IsBlankEx{
    public static void main(String[] args){
        String str="";
        System.out.println(str.isBlank());
        String s1="  ";
        System.out.println(s1.isBlank());
        String s2=" hi    hello";
        System.out.println(s2.isBlank());
    }
}