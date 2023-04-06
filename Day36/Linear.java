//program for linear search using recursion
class Linear{
    static boolean search(int[] a,int x,int first,int last){
        if(first<=last){
            if(a[first]==x){
                return true;
            }
            else{
                return search(a,x,first+1,last);
            }
        }
        return false;
    }
    public static void main(String args[]){
        int[] a={2,4,8,12,15,21,25};
        boolean res=search(a,10,0,a.length-1);
        if(res){
            System.out.println("Yes element is present");
        }
        else{
            System.out.println("No element is not present");
        }
    }
}