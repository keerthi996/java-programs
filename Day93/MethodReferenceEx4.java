class MethodReferenceEx4{
    public static void main(String[] args){
        MyFunction mf=System.out::println;
        mf.display("Hello..");
    }

}
@FunctionalInterface
interface MyFunction{
    void display(String str);
}