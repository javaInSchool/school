package example_calendar;

import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

public class Main {
    public static void main(String[] args) {
        GregorianCalendar gc = new GregorianCalendar();
        System.out.println(gc.get(Calendar.DAY_OF_MONTH));
        System.out.println(gc.get(Calendar.MONTH));
        gc.set(Calendar.MONTH, 5);
        gc.set(Calendar.DAY_OF_MONTH, 24);
        System.out.println(gc.get(Calendar.MONTH));
        System.out.println(gc.get(Calendar.DAY_OF_MONTH));

        GregorianCalendar gc2 = new GregorianCalendar(0,
                11,18);

        Date d1 = gc.getTime();
    }
}
