import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class LocalDateEx3 {
    public static void main(String[] args) {
        LocalDate date = LocalDate.of(2023, 1, 1);

        var days = ChronoUnit.DAYS.between(date,LocalDate.now());
        System.out.println(days);
        if(days%2!=0){
            System.out.println("Yes");
        }
        else{
            System.out.println("No");
        }

    }
}
