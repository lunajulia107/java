package devdojo.maratonajava.core.introductory.methods.test;

import devdojo.maratonajava.core.introductory.methods.domain.Anime;

public class AnimeTest {
    static void main() {
        Anime anime = new Anime();
        anime.init("Akudama Drive", "TV", 12);
        anime.init("Akudama Drive", "TV", 12, "Ação");
        anime.printer();
    }
}
