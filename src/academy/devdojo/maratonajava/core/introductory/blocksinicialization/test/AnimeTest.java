package devdojo.maratonajava.core.introductory.blocksinicialization.test;

import devdojo.maratonajava.core.introductory.blocksinicialization.domain.Anime;

public class AnimeTest {
    static void main() {
        Anime anime = new Anime("One Piece");

        for (int episode : anime.getEpisodes()) {
            System.out.print(episode + " ");
        }
    }
}
