package devdojo.maratonajava.core.introduction.finalmodificator.domain;

public class Car {
    private String name;
    // Atributos constantes
    public final double SPEED_LIMIT = 250;
    // A referência nunca vai ser alterada
    public final Buyer BUYER = new Buyer();

    public final void printer() {
        System.out.println(this.name);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
