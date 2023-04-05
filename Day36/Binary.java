//Program to perform binary search using recursion
class Binary{
    static boolean binary(int[] a,int x,int first,int last){
        if(first<=last){
            int mid=(first+last)/2;
            if(x==a[mid]){
                return true;
            }
            else if(x>a[mid]){
                return binary(a,x,mid+1,a.length-1);
            }
            return binary(a,x,0,mid-1);
        }
        return false;
    }
    public static void main(String args[]){
        int[] a={2,4,8,12,15,21,25};
        boolean res=binary(a,15,0,a.length-1);
        if(res){
            System.out.println("Yes element is present");
        }
        else{
            System.out.println("No element is not present");
        }

    }
}