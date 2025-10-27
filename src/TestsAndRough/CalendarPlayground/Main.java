package TestsAndRough.CalendarPlayground;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Calendar;

public class Main {

    public static void main(String[] args) {

        Calendar cal = Calendar.getInstance();
        System.out.println("cal -> " + cal);
        System.out.println("cal -> " + cal.getTime());
        cal.set(2024, Calendar.FEBRUARY, 29); // Setting date to February 29, 2024 (leap year)
        System.out.println("Date set to: " + cal.getTime());

        cal.add(Calendar.YEAR, 1); // Adding 1 year
        System.out.println("After adding 1 year: " + cal.getTime());

        cal.add(Calendar.YEAR, -1); // Subtracting 1 year
        System.out.println("After subtracting 1 year: " + cal.getTime());

//        System.out.println("Is leap year: " + cal.getActualMaximum(Calendar.DAY_OF_YEAR) == 366);

        cal = Calendar.getInstance();
        System.out.println(cal.get(Calendar.YEAR));
        System.out.println(cal.get(Calendar.DAY_OF_YEAR));
        System.out.println(cal.get(Calendar.HOUR_OF_DAY));
        System.out.println(cal.get(Calendar.MINUTE));
        System.out.println(cal.get(Calendar.SECOND));
        System.out.println(cal.get(Calendar.MILLISECOND));
        System.out.println(cal.getFirstDayOfWeek());
        System.out.println(cal.get(Calendar.DAY_OF_WEEK));

        LocalDate today = LocalDate.now();
        LocalDateTime todayLocalDateTime = LocalDateTime.now();

        System.out.println("today -> " + today);
        System.out.println("todayLocalDateTime -> " + todayLocalDateTime);

    }

}
