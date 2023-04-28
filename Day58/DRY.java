//DRY--->Do not Repeat Yourself
class DRY{
    static int pow(int a,int b){
        int power=1;
        for(int i=0;i<b;i++){
            power*=a;
        }
        return power;
    }
    public static void main(String args[]){
        System.out.println(pow(2,3));
        System.out.println(pow(3,2));
    }
}