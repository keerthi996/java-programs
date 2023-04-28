import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class LocalDateclasses {
    public static void main(String[] args) {
        LocalDate date=LocalDate.now(); 

        System.out.println(date);

        LocalTime time = LocalTime.now(); 

        System.out.println(time);

        LocalDateTime dateTime = LocalDateTime.now(); 
        
        System.out.println(dateTime);

        DateTimeFormatter format1 = DateTimeFormatter.ofPattern("yyyy-MM-dd");

        String dt1=dateTime.format(format1);

        System.out.println(dt1);

        DateTimeFormatter format2 = DateTimeFormatter.ofPattern("yyyy-MMM-dd");

        String dt2=dateTime.format(format2);

        System.out.println(dt2);
        DateTimeFormatter format3= DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");

        String dt3=dateTime.format(format3);
        System.out.println(dt3);

    }
}