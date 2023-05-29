/*The function accepts a string str as its argument. 
    The string str consists of binary digits eparated with an alphabet as follows:

    – A denotes AND operation
    – B denotes OR operation
    – C denotes XOR Operation


    Input:

    str: 1C0C1C1A0B1

    Output:

    1

    Explanation:

    The alphabets in str when expanded becomes “1 XOR 0 XOR 1 XOR 1 AND 0 OR 1”, result of the 
    expression becomes 1, hence 1 is returned.


*/
import java.util.*;
class BitwiseOp{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        int result=Character.getNumericValue(s.charAt(0));
        for(int i=1;i<s.length();i=i+2){
            if(s.charAt(i)=='A'){
                result=result & Character.getNumericValue(s.charAt(i+1));
            }
            else if(s.charAt(i)=='B'){
                result=result | Character.getNumericValue(s.charAt(i+1));
            }
            else{
                result=result ^ Character.getNumericValue(s.charAt(i+1));
            }
        }
        System.out.println(result);

    }
}