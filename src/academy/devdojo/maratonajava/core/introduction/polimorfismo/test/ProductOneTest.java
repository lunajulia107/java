package devdojo.maratonajava.core.introduction.polimorfismo.test;

import devdojo.maratonajava.core.introduction.polimorfismo.domain.Computer;
import devdojo.maratonajava.core.introduction.polimorfismo.domain.Mouse;
import devdojo.maratonajava.core.introduction.polimorfismo.domain.Product;

public class ProductOneTest {
    static void main() {
        Product product = new Computer("Ryzen 9", 3000);
        System.out.println(product.getName());
        System.out.println(product.getValue());
        System.out.println(product.taxCalculate());

        System.out.println("--------------------");

        Product productOne = new Mouse("MX", 560);
        System.out.println(productOne.getName());
        System.out.println(productOne.taxCalculate());
    }
}
