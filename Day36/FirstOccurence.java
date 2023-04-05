//Find the First occurence of an element in the array
class FirstOccurence{
    static int first(int[] a,int x,int i){
        if(a[i]<a.length){
            if(a[i]==x){
                return i;
            }
            else{
                return first(a,x,i+1);
            }
        }
        return -1;
    }
    public static void main(String args[]){
        int[] a={1,2,3,4,3,5,6,2};
        System.out.println(first(a,3,0));

    }
}