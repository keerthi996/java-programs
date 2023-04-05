//Recursively find the length of the array
class ArrayLen{
    static int len(int a[],int i){
        if(i<a.length){
            i++;
            return 1+len(a,i);
        }
        return 0;
    }
    public static void main(String args[]){
        int a[]={1,2,3,4,5,6};
        int i=0;
        System.out.println("length of the array is:"+len(a,i));

    }
}