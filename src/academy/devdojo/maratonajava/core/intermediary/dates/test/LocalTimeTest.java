package devdojo.maratonajava.core.intermediary.dates.test;

import java.time.LocalTime;
import java.time.temporal.ChronoField;

public class LocalTimeTest {
    static void main() {
        LocalTime time = LocalTime.of(23, 32, 12);
        LocalTime timeNow = LocalTime.now();

        System.out.println(time);
        System.out.println(timeNow);
        System.out.println(time.getHour());
        System.out.println(time.getMinute());
        System.out.println(time.getSecond());
        System.out.println(time.get(ChronoField.AMPM_OF_DAY));
        System.out.println(LocalTime.MIN);
    }
}
