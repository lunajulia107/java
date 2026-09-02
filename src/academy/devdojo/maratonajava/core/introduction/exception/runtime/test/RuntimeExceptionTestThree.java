package devdojo.maratonajava.core.introduction.exception.runtime.test;

public class RuntimeExceptionTestThree {
    static void main() {
        connectionOpen();
    }

    private static String connectionOpen() {
        try {
            System.out.println("Abrindo arquivo.");
            System.out.println("Escrevendo dados no arquivo.");
            return "Conexão aberta";
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            System.out.println("Fechando recurso liberado pelo SO.");
        }

        return null;
    }
}
