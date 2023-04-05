//Find the last occurence of an element
class LastOccurence{
    static int last(int[] a,int x,int i){
        if(a[i]>0){
            if(a[i]==x){
                return i;
            }
            else{
                return last(a,x,i-1);
            }
        }
        return -1;
    }
    public static void main(String args[]){
        int[] a={1,2,3,4,3,5,6,2};
        System.out.println(last(a,3,a.length-1));

    }
}