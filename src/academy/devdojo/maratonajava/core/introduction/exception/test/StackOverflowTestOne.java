package devdojo.maratonajava.core.introduction.exception.test;

public class StackOverflowTestOne {
    static void main() {
        recursividade();
    }

    public static void recursividade() {
        // Estouro de pilha (memória)
        recursividade();
    }
}
