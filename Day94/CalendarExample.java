import java.util.Calendar;

public class CalendarExample {
    public static void main(String[] args) {
        Calendar calendar = Calendar.getInstance();

        // Get current date and time
        int year = calendar.get(Calendar.YEAR);
        System.out.println(year);
        int month = calendar.get(Calendar.MONTH) + 1; // Note: Month is 0-based
        System.out.println(month);
        int day = calendar.get(Calendar.DAY_OF_MONTH);
        System.out.println(day);
        int hour = calendar.get(Calendar.HOUR_OF_DAY);
        System.out.println(hour);
        int minute = calendar.get(Calendar.MINUTE);
        System.out.println(minute);
        int second = calendar.get(Calendar.SECOND);
        System.out.println(second);
        System.out.println("Current Date and Time: " + year + "-" + month + "-" + day + " " + hour + ":" + minute + ":" + second);

        
    }
}
