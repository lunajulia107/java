package devdojo.maratonajava.core.introduction.exception.exception.test;

import java.io.File;
import java.io.IOException;

public class ExceptionTestOne {
    static void main() throws IOException {
        createNewFile();
    }

    /*public static void createNewFile() throws IOException {
        File file = new File("files\\file.txt");
        boolean isCreate = file.createNewFile();
        System.out.println("Arquivo criado: " + isCreate);
    }*/

    private static void createNewFile() {
        File file = new File("files\\file.txt");
        try {
            boolean isCreate = file.createNewFile();
            System.out.println("Arquivo criado: " + isCreate);
        } catch (IOException e) {
            e.printStackTrace();
            throw new RuntimeException("Problema na hora de criar o arquivo.");
        }
    }
}
