import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.lang.reflect.Field;
import java.lang.annotation.*;

class ReflectionApiEx2{
    public static void main(String[] args){
        Example e=new Example("Keerthi");
        Class cls=e.getClass();
        System.out.println(cls);
        Annotation an = cls.getAnnotation(Vip.class);
        System.out.println(an);
        Vip v=(Vip) an;
        System.out.println(((Vip) an).rating());
        System.out.println(((Vip) an).field());
        

    }
}
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.TYPE)
@interface Vip{
    String field();
    int rating() default 1;
}
@Vip(field="Politics",rating=4)
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