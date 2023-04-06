//To find out the equilbrium position in the array
class Equilibrium{
    static int equi(int[] a,int x){
        int leftSum=0;
        int rightSum=0;
        for(int i=0;i<x;i++){
            leftSum=leftSum+a[i];
        }
        for(int j=x+1;j<a.length;j++){
            rightSum=rightSum+a[j];
        }
        if(leftSum==rightSum){
            return x;
        }
        else{
            return equi(a,x+1);
        }
    }
    public static void main(String args[]){
        int a[] = {-7, 1, 5, 2, -4, 3, 0};
        System.out.println(equi(a,0));

    }
}