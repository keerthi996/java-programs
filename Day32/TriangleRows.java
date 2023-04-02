import java.util.*;
class TriangleRows{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter number of rows:");
        int rows=sc.nextInt();
        int result=triangle(rows);
        System.out.println(result);
    }
    static int triangle(int rows){
        if(rows==0)
        return rows;
        return rows+triangle(rows-1);
    }
}