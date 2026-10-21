package devdojo.maratonajava.core.introductory.polimorfismo.service;

import devdojo.maratonajava.core.introductory.polimorfismo.repository.Repository;

public class DatabaseRepository implements Repository {
    @Override
    public void save() {
        System.out.println("Salvando arquivo no banco de dados.");
    }
}
