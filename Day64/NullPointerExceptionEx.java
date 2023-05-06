public class NullPointerExceptionEx {
    public static void main(String[] args){
        String s=null;
        try{
            System.out.println(s.length());
        }
        catch (NullPointerException e){
            System.out.println(e);
        }
        Hello h=new Hello();
        try{
            System.out.println(h.x.length());
        }
        catch (Exception e){
            System.out.println(e);
        }

    }
}
class Hello{
    String x;
}
