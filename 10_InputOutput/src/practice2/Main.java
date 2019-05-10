package practice2;

import java.text.DateFormatSymbols;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Locale;

public class Main {
    public static void main(String[] args) {
        int seconds;
        int minutes;
        int hours;
        int day;
        String month;
        int year;

//*********1***************
        System.out.print("1 вариант: ");
        Date d = new Date();
        System.out.println(d.toString()+"(0.5 бала)");

        //*********4***************
        System.out.print("4 вариант: ");
        GregorianCalendar gc=new GregorianCalendar();
        seconds=gc.get(Calendar.SECOND);
        minutes=gc.get(Calendar.MINUTE);
        hours=gc.get(Calendar.HOUR);
        day=gc.get(Calendar.DAY_OF_MONTH);
        year=gc.get(Calendar.YEAR);

        String[] months = new DateFormatSymbols().getMonths();
        month=gc.getDisplayName(Calendar.MONTH,Calendar.LONG,
                new Locale("ru", "RU"));
        System.out.println(hours+":"+minutes+":"+seconds+", "+day+" "+month+" "+year);

        System.out.print("6 варіант: ");
        GregorianCalendar gc2=new GregorianCalendar();
        Locale b=new Locale("uk","UA");
        SimpleDateFormat sdf=new SimpleDateFormat("HH:mm:ss, dd MMMM yyyy",b);
        System.out.println(sdf.format(gc2.getTime())+" (2бала)");

    }
}
