/*
 use StringBuffer when you need thread safety or when multiple threads need to access or 
modify the same string. If you're in a single-threaded environment or don't require thread 
safety, StringBuilder is the more efficient choice due to its better performance. 
*/
public class StringBufferEx {
    public static void main(String[] args)
    {
        StringBuffer sb = new StringBuffer();
        sb.append("Hello");
        sb.append(" ");
        sb.append("world");
        String message = sb.toString();
        System.out.println(message);
        System.out.println(sb.length());
        System.out.println(sb.capacity());
        System.out.println(sb.charAt(4));//****** */
        
    }
}