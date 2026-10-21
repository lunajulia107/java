package devdojo.maratonajava.core.intermediary.streams.test;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class StreamThreeTest {
    static void main() {
        List<List<String>> legallyDesigners = new ArrayList<>();
        List<String> graphicDesigners = List.of("Emilly", "Samara");
        List<String> developers = List.of("Julia");
        List<String> students = List.of("Vitória", "Manuela", "Vivian");
        legallyDesigners.add(graphicDesigners);
        legallyDesigners.add(developers);
        legallyDesigners.add(students);

        for(List<String> people : legallyDesigners) {
            for (String person : people) {
                System.out.println(person);
            }
        }
        System.out.println("--------");
        legallyDesigners.stream()
                .flatMap(Collection::stream)
                .forEach(System.out::println);
    }
}
