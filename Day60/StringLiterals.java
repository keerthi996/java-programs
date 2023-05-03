public class StringLiterals {
    public static void main(String[] args){
        long start=System.currentTimeMillis();
        for(int i=0;i<10000000;i++){
            String s1="Keerthi";//String literals
        }
        long end=System.currentTimeMillis()-start;
        System.out.println(end);
        long starts=System.currentTimeMillis();
        for(int i=0;i<10000000;i++){
            String s1=new String("java");//String objects

        }
        long ends=System.currentTimeMillis()-starts;
        System.out.println(ends);
    }
}
