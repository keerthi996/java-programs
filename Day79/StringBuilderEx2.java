class StringBuilderEx2{
    public static void main(String[] args){
        StringBuilder str=new StringBuilder("Keerthy Kudumula");
        str.setCharAt(6,'i');
        System.out.println(str.toString());
        System.out.println(str.length());
        System.out.println(str.indexOf("K"));
        System.out.println(str.lastIndexOf("K", 5));

            
        
    }
}