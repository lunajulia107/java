package devdojo.maratonajava.core.introductory.polimorfismo.domain;

public class Keyboard extends Product {
    public static final double TAX = 0.10;

    public Keyboard(String name, double value) {
        super(name, value);
    }

    @Override
    public double taxCalculate() {
        System.out.println("Calculando imposto do teclado: ");
        return this.value * TAX;
    }
}
