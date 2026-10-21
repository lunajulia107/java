package devdojo.maratonajava.core.introductory.polimorfismo.test;

import devdojo.maratonajava.core.introductory.polimorfismo.domain.Computer;
import devdojo.maratonajava.core.introductory.polimorfismo.domain.Keyboard;
import devdojo.maratonajava.core.introductory.polimorfismo.domain.Mouse;
import devdojo.maratonajava.core.introductory.polimorfismo.service.TaxCalculator;

public class ProductTest {
    static void main() {
        Computer computer = new Computer("Gamer", 8990);
        Mouse mouse = new Mouse("MX Master", 756);
        Keyboard keyboard = new Keyboard("Dell", 100);

        TaxCalculator taxCalculator = new TaxCalculator();
        taxCalculator.taxCalculator(computer);
        System.out.println("--------------------------");
        taxCalculator.taxCalculator(mouse);
        System.out.println("--------------------------");
        taxCalculator.taxCalculator(keyboard);
    }
}
