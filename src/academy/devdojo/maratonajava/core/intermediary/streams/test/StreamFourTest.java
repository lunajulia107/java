package devdojo.maratonajava.core.intermediary.streams.test;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamFourTest {
    static void main() {
        List<String> words = List.of("Julia", "Uva", "Preto", "Java");
        String[] letters = words.get(0).split("");
        System.out.println(Arrays.toString(letters));

        List <String[]> collect =
                words.stream()
                .map(word -> word.split(""))
                .collect(Collectors.toList());

        Stream<String> stream = Arrays.stream(letters);
        List<String> lettersOne = words.stream()
                .map(w -> w.split(""))
                .flatMap(Arrays::stream)
                .collect(Collectors.toList());
        System.out.println(lettersOne);
    }
}
