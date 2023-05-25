//Difference between isBlank() and isEmpty()
class IsBlankEx1{
    public static void main(String[] args){
        String s1=" ";
        System.out.println(s1.isBlank());
        System.out.println(s1.isEmpty());
        String s2="";
        System.out.println(s2.isBlank());
        System.out.println(s2.isEmpty());
    }
}