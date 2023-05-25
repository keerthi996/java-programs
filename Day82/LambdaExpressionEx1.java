class LambdaExpressionEx1{
    public static void main(String[] args){
        Calculate c1=(int x,int y)->x+y;
        int res=c1.sum(2,3);
        System.out.println(res);
    }
}
interface Calculate{
    int sum(int x,int y);
}