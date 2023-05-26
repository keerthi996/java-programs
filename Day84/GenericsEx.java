/*A generic class is implemented exactly like a non-generic class. The only difference
 is that it contains a type parameter section. There can be more than one type of parameter,
  separated by a comma. The classes, which accept one or more parameters, ​are known as
   parameterized classes or parameterized types.
*/
class Test<T>{
    T obj;
    Test(T obj){
        this.obj=obj;
    }
    public T getObj(){
        return this.obj;
    }
}
class GenericsEx{
    public static void main(String[] args){
        Test<String> t1=new Test("Keerthi");
        System.out.println(t1.getObj());
        Test<String> t2=new Test("Thanusha");
        System.out.println(t2.getObj());
    }
}