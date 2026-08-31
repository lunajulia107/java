package devdojo.maratonajava.core.introduction.polimorfismo.service;

import devdojo.maratonajava.core.introduction.polimorfismo.repository.Repository;

public class DatabaseRepository implements Repository {
    @Override
    public void save() {
        System.out.println("Salvando arquivo no banco de dados.");
    }
}
