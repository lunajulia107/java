package devdojo.maratonajava.core.introduction.polimorfismo.domain;

public class Computer extends Product {
    public static final double TAX = 0.21;

    public Computer(String name, double value) {
        super(name, value);
    }

    @Override
    public double taxCalculate() {
        System.out.println("Calculando imposto do computador: ");
        return this.value * TAX;
    }
}
