package _5_incapsulation.lesson48_APIcalendar;

import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

public class Main {
    public static void main(String[] args) {
        Date d = new Date();
        GregorianCalendar gc = new GregorianCalendar();
        System.out.println(gc.get(Calendar.DAY_OF_MONTH));
        System.out.println(gc.get(Calendar.DAY_OF_WEEK));
        System.out.println(gc.get(Calendar.MONTH));
        gc.set(Calendar.MONTH,5);
        System.out.println(gc.get(Calendar.MONTH));

        GregorianCalendar gc2 = new GregorianCalendar(2012,4,31);
        System.out.println(gc2.get(Calendar.YEAR));
        gc2.add(Calendar.YEAR, 1);
        System.out.println(gc2.get(Calendar.YEAR));

        System.out.println(d.getTime());
        System.out.println(d.getHours());

        gc2.add(Calendar.DAY_OF_MONTH,1);
        System.out.println(gc2.get(Calendar.MONTH)); //месяц автоматически увеличился и число сменилось с 31 мая на 1 июня

        GregorianCalendar gc3 = new GregorianCalendar();
        Date d2 = gc3.getTime(); //перевод из GregorianCalendar в Date

        gc3.setTime(d2); //перевод из Date в GregorianCalendar

    }
}
