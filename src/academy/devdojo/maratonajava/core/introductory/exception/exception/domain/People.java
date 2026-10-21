package devdojo.maratonajava.core.introductory.exception.exception.domain;

import java.io.FileNotFoundException;

public class People {
    public void save() throws InvalidLoginException, FileNotFoundException {
        System.out.println("Salvando pessoa.");
    }
}
