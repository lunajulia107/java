package devdojo.maratonajava.core.introduction.streams.test;

import devdojo.maratonajava.core.introduction.streams.domain.LightNovel;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamTwoTest {
    public static List<LightNovel> lightNovels = new ArrayList<>(List.of(
            new LightNovel("Tensei Shitarra", 8.99),
            new LightNovel("Overload", 3.99),
            new LightNovel("Violet Evergaden", 5.99),
            new LightNovel("No Gane no Life", 2.99),
            new LightNovel("Fullmetal Alchemist", 5.99),
            new LightNovel("Kuno desuga", 1.99),
            new LightNovel("Monogatari", 4.00)
    ));

    static void main() {
        Stream<LightNovel> stream = lightNovels.stream();
        lightNovels.forEach(System.out::println);
        long count = stream
                .distinct()
                .filter(ln -> ln.getPrice() <= 4)
                .count();

        System.out.println(count);
    }
}
