package devdojo.maratonajava.core.introductory.constructors.test;

import devdojo.maratonajava.core.introductory.constructors.domain.Anime;

public class AnimeTest {
    static void main() {
        Anime anime = new Anime("Akudama Drive", "TV", 12, "Ação", "Production IG");
        Anime animeOne = new Anime();

        anime.printer();
        System.out.println("------");
        animeOne.printer();
        System.out.println("------");
    }
}
