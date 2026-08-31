package devdojo.maratonajava.core.introduction.polimorfismo.service;

import devdojo.maratonajava.core.introduction.polimorfismo.domain.Mouse;
import devdojo.maratonajava.core.introduction.polimorfismo.domain.Product;

import java.util.Locale;

public class TaxCalculator {
    public static void taxCalculator(Product product) {
        double tax = product.taxCalculate();
        System.out.println("Nome do produto: " + product.getName());
        System.out.println("Valor do produto: " + product.getValue());
        System.out.println("Imposto do produto: " +  String.format(Locale.US, "%.2f", tax));

        if (product instanceof Mouse mouse) {
            System.out.println("Data de validade: " + mouse.getFabricationDate());
        }
    }
}
