package devdojo.maratonajava.core.introductory.staticmodificators.domain;

public class Anime {
    private String name;
    private static int[] episodes;
    // 0 - Bloco de inicialização é carregado quando a JVM carregar a classe
    // 1 - Alocado espaço em memória para objeto
    // 2 - Cada atributo de classe é criado com valores default ou o que for passado
    // 3 - Bloco de inicialização é executado
    // 4 - Construtor é executado
    static {
        System.out.println("Dentro do bloco de inicialização está em qualquer lugar do código.");
        episodes = new int[100];

        for (int i = 0; i < episodes.length; i++) {
            episodes[i] = i + 1;
        }
    }

    static {
        System.out.println("Bloco de inicialização static 1.");
    }

    static {
        System.out.println("Bloco de inicialização static 2.");
    }

    {
        System.out.println("Bloco de inicialização não static.");
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
        return Anime.episodes;
    }
}
