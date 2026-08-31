package devdojo.maratonajava.core.introduction.optional.test;

import java.util.List;
import java.util.Optional;

public class OptionalTest {
    static void main() {
        Optional<String> opcionalOne = Optional.of("Teste");
        Optional<String> opcionalTwo = Optional.ofNullable(null);
        Optional<String> opcionalThree = Optional.empty();

        Optional<String> nameOptional = findName("Julia");
        String empty = nameOptional.orElse("EMPTY");
        nameOptional.ifPresent(s -> System.out.println(s.toUpperCase()));
    }


    private static Optional<String> findName(String name) {
        List<String> listNames = List.of("Julia", "Larissa", "Luana", "Bianca");
        int i = listNames.indexOf(name);
        if (i != 1) {
            return Optional.of(listNames.get(i));
        }
        return Optional.empty();
    }
}
