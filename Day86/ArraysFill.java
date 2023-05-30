import java.util.Arrays;
  
public class ArraysFill
{
    public static void main(String[] args)
    {
        int[] ar=new int[10];
        Arrays.fill(ar, 1, 5, 10);
     
        System.out.println(Arrays.toString(ar));
    }
}