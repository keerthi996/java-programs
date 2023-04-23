import java.util.*;
class PuppyAndSum
{
    static int sum(int d,int n){
		    if(d!=0){
		        int s=n*(n+1)/2;
		        return s;
		    }
		    return 0;
		}
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		for(int i=0;i<t;i++){
		    int D=sc.nextInt();
		    int N=sc.nextInt();
		    int temp=N;
		    for(int j=D;j>0;j--){
		        int num=sum(D,temp);
		        temp=num;
		    }
		    System.out.println(temp);
		}
	}
}
