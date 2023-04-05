//program to perform Sum of the elements of an array
//Find the last occurence of an element
class ArraySum{
    static int sum(int[] a,int i){
        int s=0;
        if(i>=0){
            s+=a[i];
            return s+sum(a,i-1);
        }
        return 0;
    }
    public static void main(String args[]){
        int[] a={6,2,3,2};
        System.out.println(sum(a,a.length-1));

    }
}