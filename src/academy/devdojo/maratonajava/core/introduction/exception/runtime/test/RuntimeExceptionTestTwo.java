package devdojo.maratonajava.core.introduction.exception.runtime.test;

// unchecked
public class RuntimeExceptionTestTwo {
    static void main() {
        System.out.println(division(5, 0));
    }

    private static int division(int a, int b) {
        if (b == 0) {
            throw new IllegalArgumentException("Argumento ilegal não pode ser igual a 0.");
        }

        return a/b;
    }
}
