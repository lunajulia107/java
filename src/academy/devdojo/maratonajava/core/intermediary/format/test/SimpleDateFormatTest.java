package devdojo.maratonajava.core.intermediary.format.test;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class SimpleDateFormatTest {
    static void main() {
        String pattern = "dd MMMM yyyy";
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat(pattern, new java.util.Locale("pt", "BR"));
        System.out.println(simpleDateFormat.format(new Date()));

        try {
            System.out.println(simpleDateFormat.parse("19 Outubro 2026"));
        } catch (ParseException e) {
            e.printStackTrace();
        }
    }
}
