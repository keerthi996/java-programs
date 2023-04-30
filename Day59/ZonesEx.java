import java.time.Instant;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;

public class ZonesEx {
    public static void main(String[] args){
        ZonedDateTime z=ZonedDateTime.now();
        System.out.println(z);
        System.out.println(ZoneId.of("Asia/Kolkata"));
        System.out.println(LocalDateTime.now(ZoneId.of("Asia/Kolkata")));
        System.out.println(Instant.now());
    }
}
