package devdojo.maratonajava.core.introduction.exception.exception.domain;

import java.io.FileNotFoundException;

public class Employee extends People {
    public void save() throws InvalidLoginException, FileNotFoundException {
        System.out.println("Salvando funcionário.");
    }
}
