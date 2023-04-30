import java.time.LocalDate;

public class LocalDateEx2 {
    public static void main(String[] args){
        LocalDate date=LocalDate.now();
        System.out.println(date.minusDays(15));
        System.out.println(date.plusDays(25));
        System.out.println(date.minusMonths(3));
        System.out.println(date.minusWeeks(2));
        System.out.println(date.plusMonths(5));
        System.out.println(date.plusYears(2));
    }
}
