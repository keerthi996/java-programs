

import java.util.*;
class GameBetweenFriends
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		for(int i=0;i<t;i++){
		    int[] a=new int[4];
            for(int j=0;j<4;j++){
                a[j]=sc.nextInt();
            }
		    for(int j=0,k=2;j<2;j++,k=k+1){
		        if(a[0]<a[1]){
		            a[0]=a[0]+a[k];
		        }
		        else{
		            a[1]=a[1]+a[k];
		        }
		    }
		    if(a[1]>a[0]){
		        System.out.println("S");
		    }
		    else{
		        System.out.println("N");
		    }
		}
	}
}
