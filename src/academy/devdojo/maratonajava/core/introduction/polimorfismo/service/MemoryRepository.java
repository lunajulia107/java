package devdojo.maratonajava.core.introduction.polimorfismo.service;

import devdojo.maratonajava.core.introduction.polimorfismo.repository.Repository;

public class MemoryRepository implements Repository {
    @Override
    public void save() {
        System.out.println("Salvando em memória.");
    }
}
