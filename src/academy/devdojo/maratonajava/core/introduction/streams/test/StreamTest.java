package devdojo.maratonajava.core.introduction.streams.test;

import devdojo.maratonajava.core.introduction.streams.domain.LightNovel;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class StreamTest {
    private static List<LightNovel> lightNovels = new ArrayList<>(List.of(
            new LightNovel("Tensei Shitarra", 8.99),
            new LightNovel("Overload", 3.99),
            new LightNovel("Violet Evergaden", 5.99),
            new LightNovel("No Gane no Life", 2.99),
            new LightNovel("Fullmetal Alchemist", 5.99),
            new LightNovel("Kuno desuga", 1.99),
            new LightNovel("Monogatari", 4.00)
    ));

    static void main() {
        lightNovels.sort(Comparator.comparing(LightNovel::getTitle));
        List<String> titles = new ArrayList<>();

        for (LightNovel lightNovel : lightNovels) {
            if (lightNovel.getPrice() <= 4) {
                titles.add(lightNovel.getTitle());
            }

            if(titles.size() >= 3) {
                break;
            }
        }

        System.out.println(lightNovels);
        System.out.println(titles);
    }
}
