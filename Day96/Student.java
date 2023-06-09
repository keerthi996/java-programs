import java.lang.annotation.Repeatable;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

@Retention(RetentionPolicy.RUNTIME)
@Repeatable(Students.class)

@interface Student {
    String name();
    int rollNo() default  1;
    
    String mailId();

}
@Retention(RetentionPolicy.RUNTIME)

@interface Students { // repeatable interface
    Student[] value();
}