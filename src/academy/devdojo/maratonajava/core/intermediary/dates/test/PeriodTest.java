package devdojo.maratonajava.core.intermediary.dates.test;

import java.time.LocalDate;
import java.time.Period;
import java.time.temporal.ChronoUnit;

public class PeriodTest {
    static void main() {
        LocalDate now = LocalDate.now();
        LocalDate nowAfterTwoYears = LocalDate.now().plusYears(2).plusDays(7);

        Period period = Period.between(now, nowAfterTwoYears);
        Period periodOne = Period.ofDays(1);

        System.out.println(period);
        System.out.println(periodOne);
        System.out.println(periodOne.getMonths());
        System.out.println(Period.between(LocalDate.now(), LocalDate.now()).plusYears(periodOne.getDays()).getMonths());
        System.out.println(now.until(now.plusDays(2), ChronoUnit.DAYS));
    }
}
