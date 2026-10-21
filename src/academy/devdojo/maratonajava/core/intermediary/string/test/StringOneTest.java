package devdojo.maratonajava.core.intermediary.string.test;

public class StringOneTest {
    static void main() {
        // String interning
        String name = "Julia"; // String constant pool
        String nameOne = "Júlio";
        name = name.concat(" Rodrigues");

        System.out.println(name);
        System.out.println(name == nameOne);

        // 1. Variável de referência; 2. Objeto do tipo string; 3. Uma string no pool
        String nameTwo = new String("Júlio");
        System.out.println(nameOne == nameTwo.intern());
    }
}
