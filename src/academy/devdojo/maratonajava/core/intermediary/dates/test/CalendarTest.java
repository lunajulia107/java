package devdojo.maratonajava.core.intermediary.dates.test;

import java.util.Calendar;
import java.util.Date;

public class CalendarTest {
    static void main() {
        Calendar c = Calendar.getInstance();

        if (c.getFirstDayOfWeek() == Calendar.SUNDAY) {
            System.out.println("Domingão - 1º dia da semana");
        }

        System.out.println(c.get(Calendar.DAY_OF_MONTH));

        c.add(Calendar.DAY_OF_MONTH, 12);
        c.roll(Calendar.DAY_OF_MONTH, 12);

        Date date = c.getTime();
        System.out.println(date);

    }
}
