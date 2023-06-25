public class IslandsOfIsolation {
    IslandsOfIsolation n;
    public static void main(String[] args){
        IslandsOfIsolation i1=new IslandsOfIsolation();
        IslandsOfIsolation i2=new IslandsOfIsolation();
        i1.n=i2;
        i2.n=i1;
        i1=null;
        i2=null;
        System.gc();



    }

    @Override
    protected void finalize() throws Throwable {
        System.out.println("Finalize method called");
    }
}
