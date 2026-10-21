package devdojo.maratonajava.core.intermediary.dates.test;

import java.time.Instant;
import java.time.LocalDateTime;

public class InstantTest {
    static void main() {
        Instant now = Instant.now();

        System.out.println(now);
        System.out.println(LocalDateTime.now());
        System.out.println(now.getEpochSecond());
        System.out.println(now.getNano()); // 999.999.999
    }
}
