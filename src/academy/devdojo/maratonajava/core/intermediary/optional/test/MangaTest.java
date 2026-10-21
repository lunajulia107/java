package devdojo.maratonajava.core.intermediary.optional.test;

import devdojo.maratonajava.core.intermediary.optional.domain.Manga;
import devdojo.maratonajava.core.intermediary.optional.repository.MangaRepository;

import java.util.Optional;

public class MangaTest {
    static void main() {
        Optional<Manga> mangaByTitle = MangaRepository.findByTitle("Boku no hero");
        mangaByTitle.ifPresent(m -> m.setTitle("Boku no Hero"));
        System.out.println(mangaByTitle);

        Optional<Manga> mangaById = MangaRepository.findById(2);
        mangaById.orElseThrow(IllegalAccessError::new);
        System.out.println(mangaById);

        Manga newManga = MangaRepository.findByTitle("Drifters")
                .orElseGet(() -> new Manga(3, "Drifters", 30));
        System.out.println(newManga);

    }
}
