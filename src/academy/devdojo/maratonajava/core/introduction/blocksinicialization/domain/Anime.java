package devdojo.maratonajava.core.introduction.blocksinicialization.domain;

public class Anime {
    private String name;
    private int[] episodes;
    // Bloco de instânica executado toda vez que cria um objeto
    // 1 - Alocado espaço em memória para objeto
    // 2 - Cada atributo de classe é criado com valores default ou o que for passado
    // 3 - Bloco de inicialização é executado
    // 4 - Construtor é executado
    {
        System.out.println("Dentro do bloco de inicialização está em qualquer lugar do código.");
        episodes = new int[100];

        for (int i = 0; i < episodes.length; i++) {
            episodes[i] = i + 1;
        }
    }

    public Anime(String name) {
        this.name = name;
    }

    public Anime() {

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int[] getEpisodes() {
        return episodes;
    }

    public void setEpisodes(int[] episodes) {
        this.episodes = episodes;
    }
}
