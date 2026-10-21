package devdojo.maratonajava.core.introductory.exception.exception.test;

import devdojo.maratonajava.core.introductory.exception.exception.domain.WriteOne;
import devdojo.maratonajava.core.introductory.exception.exception.domain.WriteTwo;

import java.io.*;

public class TryWithResourcesTestOne {
    static void main() {
        fileWrite();
    }

    public static void fileWrite() {
        try (
                WriteOne writeOne = new WriteOne();
                WriteTwo writeTwo = new WriteTwo();
        ) {

        } catch (IOException e) {

        }
    }

    public static void fileWriteOne() {
        Reader reader = null;

        try {
            reader = new BufferedReader(new FileReader("teste.txt"));
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } finally {
            try {
                reader.close();
            } catch (IOException exception) {
                exception.printStackTrace();
            }
        }
    }
}
