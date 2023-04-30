import java.time.LocalDate;
import java.time.Period;

public class LocalDateEx4 {
    public static void main(String[] args){
        LocalDate d1=LocalDate.now();
        LocalDate d2=LocalDate.of(2001,4,1);
        Period p=Period.between(d1,d2);
        System.out.println(p);
    }
}
