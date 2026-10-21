package devdojo.maratonajava.core.intermediary.dates.test;

public class Date {
    static void main() {
        // Está totalmente depreciada
        java.util.Date date = new java.util.Date(1_000_000_000); // long

        System.out.println(date.toString());
    }
}
