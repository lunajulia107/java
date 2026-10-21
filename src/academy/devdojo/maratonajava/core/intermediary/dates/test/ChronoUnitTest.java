package devdojo.maratonajava.core.intermediary.dates.test;

import java.time.LocalDateTime;
import java.time.Month;
import java.time.temporal.ChronoUnit;

public class ChronoUnitTest {
    static void main() {
        LocalDateTime niver = LocalDateTime.of(2004, Month.JULY, 3, 7, 0, 0);
        LocalDateTime localDateTime = LocalDateTime.now();

        System.out.println(ChronoUnit.DAYS.between(niver, localDateTime));
    }
}
