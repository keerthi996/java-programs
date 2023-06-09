import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

class ReflectionApiEx{
    public static void main(String[] args){
        Example e=new Example("Keerthi");
        boolean isVip=e.getClass().isAnnotationPresent(Vip.class);
        if(isVip){
            e.fun();
        }
        else{
            System.out.println(e.name+" is not a VIP");
        }
        Example1 e1=new Example1("Thanusha");
        boolean isVipex=e1.getClass().isAnnotationPresent(Vip.class);
        if(isVipex){
            e1.fun();
        }
        else{
            System.out.println(e1.name+" is not a VIP");
        }

    }
}
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.TYPE)
@interface Vip{

}
@Vip
class Example{
    String name;
    public Example(String name){
        this.name=name;
    }
    public void fun(){
        System.out.println(this.name+" is vip");
    }
}
class Example1{
    String name;
    public Example1(String name){
        this.name=name;
    }
    public void fun(){
        System.out.println(this.name+"is vip");
    }
}