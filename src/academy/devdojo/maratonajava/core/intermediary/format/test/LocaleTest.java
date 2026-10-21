package devdojo.maratonajava.core.intermediary.format.test;

import java.text.DateFormat;
import java.util.Calendar;
import java.util.Locale;

public class LocaleTest {
    static void main() {
        Calendar calendar = Calendar.getInstance();
        Locale localeIt = new Locale("it", "IT");
        Locale localeCh = new Locale("it", "CH");
        Locale localeIn = new Locale("hi", "IN");
        Locale localeJp = new Locale("ja", "JP");
        Locale localeNl = new Locale("nl", "NL");

        DateFormat dateFormatOne = DateFormat.getDateInstance(DateFormat.FULL, localeIt);
        DateFormat dateFormatTwo = DateFormat.getDateInstance(DateFormat.FULL, localeCh);
        DateFormat dateFormatThree = DateFormat.getDateInstance(DateFormat.FULL, localeIn);
        DateFormat dateFormatFour = DateFormat.getDateInstance(DateFormat.FULL, localeJp);
        DateFormat dateFormatFive = DateFormat.getDateInstance(DateFormat.FULL, localeNl);

        System.out.println(dateFormatOne + " " + dateFormatOne.format(calendar.getTime()));
        System.out.println(dateFormatTwo + " " + dateFormatTwo.format(calendar.getTime()));
        System.out.println(dateFormatThree + " " + dateFormatThree.format(calendar.getTime()));
        System.out.println(dateFormatFour + " " + dateFormatFour.format(calendar.getTime()));
        System.out.println(dateFormatFive + " " + dateFormatFive.format(calendar.getTime()));

        System.out.println(localeIt.getDisplayCountry());
    }
}
