package bolum9.pkg5;
import java.util.GregorianCalendar;

public class GregorianCalendar1 {


    public static void main(String[] args) {
        
        GregorianCalendar calendar = new GregorianCalendar();

        System.out.println("Current year: " + calendar.get(GregorianCalendar.YEAR));
        System.out.println("Current month: " + (calendar.get(GregorianCalendar.MONTH) + 1));
        System.out.println("Current day: " + calendar.get(GregorianCalendar.DAY_OF_MONTH));

        calendar.setTimeInMillis(1234567898765L);

        System.out.println("Year: " + calendar.get(GregorianCalendar.YEAR));
        System.out.println("Month: " + (calendar.get(GregorianCalendar.MONTH) + 1));
        System.out.println("Day: " + calendar.get(GregorianCalendar.DAY_OF_MONTH));
    }
    
}
