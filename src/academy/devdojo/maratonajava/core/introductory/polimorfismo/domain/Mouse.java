package devdojo.maratonajava.core.introductory.polimorfismo.domain;

public class Mouse extends Product {
    public static final double TAX = 0.15;
    private String fabricationDate;

    public Mouse(String name, double value) {
        super(name, value);
    }

    @Override
    public double taxCalculate() {
        System.out.println("Calculando imposto do mouse: ");
        return this.value * TAX;
    }

    public String getFabricationDate() {
        return fabricationDate;
    }

    public void setFabricationDate(String fabricationDate) {
        this.fabricationDate = fabricationDate;
    }
}
