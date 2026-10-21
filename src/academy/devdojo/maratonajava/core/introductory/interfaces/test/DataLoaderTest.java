package devdojo.maratonajava.core.introductory.interfaces.test;

import devdojo.maratonajava.core.introductory.interfaces.domain.DataBaseLoader;
import devdojo.maratonajava.core.introductory.interfaces.domain.DataLoader;
import devdojo.maratonajava.core.introductory.interfaces.domain.FileLoader;

public class DataLoaderTest {
    static void main() {
        DataBaseLoader dataBaseLoader = new DataBaseLoader();
        FileLoader fileLoader = new FileLoader();

        dataBaseLoader.load();
        dataBaseLoader.remove();
        dataBaseLoader.checkPermission();
        dataBaseLoader.retrieveMaxDataSize();
        DataLoader.retrieveMaxDataSize();
        System.out.println("----------------");
        fileLoader.load();
        fileLoader.remove();
        fileLoader.checkPermission();
    }
}
