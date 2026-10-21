package devdojo.maratonajava.core.intermediary.dates.test;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;

public class LocalDateTimeTest {
    static void main() {
        LocalDateTime localDateTime = LocalDateTime.now();
        LocalDate localDate = LocalDate.of(2027, Month.OCTOBER, 20);
        LocalTime localTime = LocalTime.of(18, 24, 21);

        System.out.println(localDateTime);
        System.out.println(localDate);
        System.out.println(localTime);

        LocalDateTime localDateTimeOne = localDate.atTime(localTime);
        System.out.println(localDateTimeOne);
    }
}
