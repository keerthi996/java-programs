class GenericEx1{
    public static void main(String[] args){
        Test1<String,Integer> t1=new Test1<String,Integer>("Keerthi",16);
        t1.print();
    }
}
class Test1<T,U>{
    T name;
    U rollNo;
    Test1(T name,U rollNo){
        this.name=name;
        this.rollNo=rollNo;
    }
    public void print()
    {
        System.out.println(name);
        System.out.println(rollNo);
    }
}