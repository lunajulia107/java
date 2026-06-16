package devdojo.maratonajava.core.introduction.constructors.domain;

public class Anime {
    private String name;
    private String type;
    private int episodes;
    private String gender;
    private String studio;

    // Construtor executado antes de qualquer método da classe
    public Anime (
            String name,
            String type,
            int episodes,
            String gender) {
        this();
        this.name = name;
        this.type = type;
        this.episodes = episodes;
        this.gender = gender;
    }

    public Anime() {

    }

    public Anime (
            String name,
            String type,
            int episodes,
            String gender,
            String studio
    ) {
        // this precisa ser a primeira linha executável
        this(name, type, episodes, gender);
        this.studio = studio;
    }

    public void printer() {
        System.out.println(this.name);
        System.out.println(this.type);
        System.out.println(this.episodes);
        System.out.println(this.gender);
        System.out.println(this.studio);
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
