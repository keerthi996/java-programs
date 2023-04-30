import java.time.LocalDate;
public class LocalDates {
    public static void main(String[] args){
        LocalDate d1=LocalDate.now();
        System.out.println(d1);
        System.out.println(LocalDate.now().getDayOfMonth());
        System.out.println(LocalDate.now().getYear());
        System.out.println(LocalDate.now().getDayOfWeek());
        System.out.println(LocalDate.now().getMonth());
        System.out.println(LocalDate.now().getMonthValue());
        System.out.println(LocalDate.now().lengthOfMonth());
        System.out.println(LocalDate.now().isLeapYear());
        System.out.println(LocalDate.now().getChronology());

    }
}
