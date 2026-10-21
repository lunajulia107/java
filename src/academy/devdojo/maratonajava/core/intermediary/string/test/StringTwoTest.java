package devdojo.maratonajava.core.intermediary.string.test;

public class StringTwoTest {
    static void main() {
        String name = " Luffy";
        String numbers = "012345";

        System.out.println(name.charAt(4));
        System.out.println(name.length());
        System.out.println(name.replace("L", "J"));
        System.out.println(name.toLowerCase());
        System.out.println(name.toUpperCase());
        System.out.println(numbers.substring(0, 3));
        System.out.println(name.trim());
    }
}
