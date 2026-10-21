package devdojo.maratonajava.core.introductory.polimorfismo.service;

import devdojo.maratonajava.core.introductory.polimorfismo.repository.Repository;

public class MemoryRepository implements Repository {
    @Override
    public void save() {
        System.out.println("Salvando em memória.");
    }
}
