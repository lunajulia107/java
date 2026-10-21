package devdojo.maratonajava.core.introductory.polimorfismo.domain;

public abstract class Product implements Tahavel {
    protected String name;
    protected double value;

    public Product(String name, double value) {
        this.name = name;
        this.value = value;
    }

    public String getName() {
        return name;
    }

    public double getValue() {
        return value;
    }
}
