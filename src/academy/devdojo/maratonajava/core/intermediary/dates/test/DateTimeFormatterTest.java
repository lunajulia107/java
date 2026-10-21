package devdojo.maratonajava.core.intermediary.dates.test;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class DateTimeFormatterTest {
    static void main() {
        LocalDate date = LocalDate.now();
        String dateOne = date.format(DateTimeFormatter.BASIC_ISO_DATE);
        String dateTwo = date.format(DateTimeFormatter.ISO_DATE);
        String dateThree = date.format(DateTimeFormatter.ISO_LOCAL_DATE);

        System.out.println(date);
        System.out.println(dateOne);
        System.out.println(dateTwo);
        System.out.println(dateThree);

        LocalDate parseOne = LocalDate.parse("20210219", DateTimeFormatter.BASIC_ISO_DATE);
        System.out.println(parseOne);

        LocalDateTime now = LocalDateTime.now();
        String stringDate = now.format(DateTimeFormatter.ISO_DATE_TIME);
        System.out.println(stringDate);

        LocalDateTime parseTwo = LocalDateTime.parse("2026-10-21T20:46:00", DateTimeFormatter.ISO_DATE_TIME);
        System.out.println(parseTwo);

        //dd/MM/yyyy
        //MM/dd/yyyy
        //yyyy/MM/dd
        DateTimeFormatter formatterBR = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        String formatBR = LocalDate.now().format(formatterBR);
        System.out.println(formatBR);
    }
}
