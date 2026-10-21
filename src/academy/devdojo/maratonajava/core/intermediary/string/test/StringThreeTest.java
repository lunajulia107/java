package devdojo.maratonajava.core.intermediary.string.test;

public class StringThreeTest {
    static void main() {
        long start = System.currentTimeMillis();
        concatString(100_000);
        long end = System.currentTimeMillis();

        System.out.println("Tempo gasto para string " + (end - start) + " ms.");

        start = System.currentTimeMillis();
        concatStringBuilder(100_000);
        end = System.currentTimeMillis();
        System.out.println("Tempo gasto para string " + (end - start) + " ms.");

        start = System.currentTimeMillis();
        concatStringBuffer(100_000);
        end = System.currentTimeMillis();
        System.out.println("Tempo gasto para string " + (end - start) + " ms.");
    }

    private static void concatString(int size) {
        String text = "";

        for (int i = 0; i < size; i++) {
            text += i;
        }
    }

    private static void concatStringBuilder(int size) {
        StringBuilder sb = new StringBuilder(size);

        for (int i = 0; i < size; i++) {
            sb.append(i);
        }
    }

    // Multi-thread
    private static void concatStringBuffer(int size) {
        StringBuffer sb = new StringBuffer(size);

        for (int i = 0; i < size; i++) {
            sb.append(i);
        }
    }
}
