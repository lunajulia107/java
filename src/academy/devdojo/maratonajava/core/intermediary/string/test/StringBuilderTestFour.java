package devdojo.maratonajava.core.intermediary.string.test;

public class StringBuilderTestFour {
    static void main() {
        // Imutáveis
        String name = "Julia";

        name.concat(" - AAA");
        name.substring(0,2);
        System.out.println(name);

        // Trabalha direto com a String
        StringBuilder sb = new StringBuilder("Julia");
        sb.append(" - AAA");
        sb.substring(0,2);
        sb.reverse();
        System.out.println(sb);
    }
}
