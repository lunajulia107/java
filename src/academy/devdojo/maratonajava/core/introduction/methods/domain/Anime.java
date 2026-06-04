package devdojo.maratonajava.core.introduction.methods.domain;

public class Anime {
    private String name;
    private String type;
    private int episodes;
    private String gender;

    public void init(String name, String type, int episodes) {
        this.name = name;
        this.type = type;
        this.episodes = episodes;
    }

    // Sobrecarga: Método com o mesmo nome, porém atributos ou valores deles diferentes
    public void init(String name, String type, int episodes, String gender) {
        this.init(name, type, episodes);
        this.gender = gender;
    }

    public void printer() {
        System.out.println(this.name);
        System.out.println(this.type);
        System.out.println(this.episodes);
        System.out.println(this.gender);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.type = name;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getEpisodes() {
        return episodes;
    }

    public void setEpisodes(int episodios) {
        this.episodes = episodios;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }
}
