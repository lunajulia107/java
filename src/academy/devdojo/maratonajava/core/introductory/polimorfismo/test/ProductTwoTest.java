package devdojo.maratonajava.core.introductory.polimorfismo.test;

import devdojo.maratonajava.core.introductory.polimorfismo.domain.Computer;
import devdojo.maratonajava.core.introductory.polimorfismo.domain.Mouse;
import devdojo.maratonajava.core.introductory.polimorfismo.service.TaxCalculator;

public class ProductTwoTest {
    static void main() {
        Computer computer = new Computer("Gamer", 8990);
        Mouse mouse = new Mouse("MX Master", 756);

        mouse.setFabricationDate("23/09/2026");
        TaxCalculator.taxCalculator(computer);
        System.out.println("-----------------------");
        TaxCalculator.taxCalculator(mouse);
    }
}
