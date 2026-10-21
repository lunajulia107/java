package devdojo.maratonajava.core.intermediary.dates.test;

import java.time.Duration;
import java.time.LocalDateTime;

public class DurationTest {
    static void main() {
        LocalDateTime now = LocalDateTime.now();
        LocalDateTime nowAfterTwoYears = LocalDateTime.now().plusYears(2);
        LocalDateTime timeNow = LocalDateTime.now();
        LocalDateTime timeMinusSevenHours = LocalDateTime.now().minusHours(7);

        System.out.println(Duration.between(now, nowAfterTwoYears));
        System.out.println(Duration.between(timeNow, timeMinusSevenHours));
        System.out.println(Duration.ofDays(20));
        System.out.println(Duration.ofMinutes(3));

        // Duration - não aceita LocalDate, pois não tem segundos
    }
}
