class MethodChainingEx2{
    public static void main(String[] args){
        Marks m1=new Marks().setSub1(78).setSub2(89).add();
        System.out.println(m1.result());
    }
}
class Marks{
    private int sub1;
    private int sub2;
    private int sum;
    public Marks setSub1(int sub1){
        this.sub1=sub1;
        return this;
    }
    public Marks setSub2(int sub2){
        this.sub2=sub2;
        return this;
    }
    public Marks add(){
        this.sum=this.sub1+this.sub2;
        return this;
    }
    public int result(){
        return this.sum;
    }
}