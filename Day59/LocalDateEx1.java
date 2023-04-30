import java.time.LocalDate;

public class LocalDateEx1 {
    public static void main(String[] args){
        LocalDate keerthiBirthday=LocalDate.of(2001,4,1);
        LocalDate aishuBirthday=LocalDate.of(2001,12,28);
        var compare1=keerthiBirthday.isAfter(aishuBirthday);
        System.out.println(compare1);
        var compare2=keerthiBirthday.isBefore(aishuBirthday);
        System.out.println(compare2);
    }
}
