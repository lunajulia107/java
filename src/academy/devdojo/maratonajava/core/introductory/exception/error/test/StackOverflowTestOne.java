package devdojo.maratonajava.core.introductory.exception.error.test;

public class StackOverflowTestOne {
    static void main() {
        recursividade();
    }

    public static void recursividade() {
        // Estouro de pilha (memória)
        recursividade();
    }
}
