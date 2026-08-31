package devdojo.maratonajava.core.introduction.overwritten.domain;

public class Anime extends Object {
    private String name;

    public Anime(String name) {
        this.name = name;
    }

    @Override
    // Método sobrescrito
    public String toString() {
        return "Anime: " + name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
