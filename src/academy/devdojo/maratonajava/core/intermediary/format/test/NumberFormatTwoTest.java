package devdojo.maratonajava.core.intermediary.format.test;

import java.text.NumberFormat;
import java.text.ParseException;
import java.util.Locale;

public class NumberFormatTwoTest {
    static void main() {
        Locale localeDefault = Locale.getDefault();
        Locale localeJP = Locale.JAPAN;
        Locale localeIT = Locale.ITALY;

        NumberFormat[] numbersFormat = new NumberFormat[3];
        numbersFormat[0] = NumberFormat.getInstance(localeDefault);
        numbersFormat[1] = NumberFormat.getInstance(localeJP);
        numbersFormat[2] = NumberFormat.getInstance(localeIT);

        double value = 10_000.21;

        for (NumberFormat numberFormat : numbersFormat) {
            System.out.println(numberFormat.getMaximumFractionDigits() + " " + numberFormat.format(value));
        }

        String valueString = "10.000,21";
        try {
            System.out.println(numbersFormat[0].parse(valueString));
        } catch (ParseException e) {
            e.printStackTrace();
        }
    }
}