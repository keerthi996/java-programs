import java.util.Calendar;

public class CalendarMethodsExample {
    public static void main(String[] args) {
        Calendar calendar = Calendar.getInstance();

        // Get the current year
        int year = calendar.get(Calendar.YEAR);
        System.out.println("Current Year: " + year);

        // Set the month to March 
        calendar.set(Calendar.MONTH, Calendar.MARCH);
        int month = calendar.get(Calendar.MONTH);
        System.out.println("Updated Month: " + month);

        // Add 10 days to the current date
        calendar.add(Calendar.DAY_OF_MONTH, 10);
        int day = calendar.get(Calendar.DAY_OF_MONTH);
        System.out.println("Updated Day: " + day);

        

        

        
    }
}
