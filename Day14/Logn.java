//log n Complexity:
class  Logn{
    public static void main(String args[]){
        int count=0;
        for(int i=2;i<=50;i*=2){
            System.out.println(i);
            count++;
        }
        System.out.println(count);
    }
}