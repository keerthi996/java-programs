//Example for Multilevel inheritance
class Addition{
    int sum(int a,int b) {
        return a+b;
    }
}
class Substraction extends Addition{
    int sub(int a,int b){
        return a-b;
    }
}
class MultiLevel extends Substraction{
    public static void main(String args[]){
        MultiLevel ml=new MultiLevel();
        System.out.println(ml.sum(20,30));
        System.out.println(ml.sub(30,20));
        
    }
}