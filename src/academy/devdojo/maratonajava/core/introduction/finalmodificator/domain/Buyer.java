package devdojo.maratonajava.core.introduction.finalmodificator.domain;

public class Buyer {
    private String name;

    @Override
    public String toString() {
        return "Comprador: " + name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
