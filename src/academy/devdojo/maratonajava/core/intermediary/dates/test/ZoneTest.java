package devdojo.maratonajava.core.intermediary.dates.test;

import java.time.*;
import java.util.Map;

public class ZoneTest {
    static void main() {
        Map<String, String> shortIds = ZoneId.SHORT_IDS;
        System.out.println(shortIds);
        System.out.println(ZoneId.systemDefault());

        ZoneId tokyoZone = ZoneId.of("Asia/Tokyo");
        System.out.println(tokyoZone);

        LocalDateTime now = LocalDateTime.now();
        ZonedDateTime zonedDateTime = now.atZone(tokyoZone);
        System.out.println(now);
        System.out.println(zonedDateTime);

        Instant nowInstant = Instant.now();
        System.out.println(nowInstant);

        ZonedDateTime zonedDateTimeOne = nowInstant.atZone(tokyoZone);
        System.out.println(zonedDateTimeOne);

        System.out.println(ZoneOffset.MIN);
        System.out.println(ZoneOffset.MAX);

        ZoneOffset offsetManaus = ZoneOffset.of("-04:00");
        OffsetDateTime offsetDateTime = now.atOffset(offsetManaus);
        OffsetDateTime offsetDateTimeOne = OffsetDateTime.of(now, offsetManaus);
        System.out.println(offsetDateTime);
        System.out.println(offsetDateTimeOne);
    }
}
