package devdojo.maratonajava.core.introductory.polimorfismo.test;

import devdojo.maratonajava.core.introductory.polimorfismo.service.DatabaseRepository;

public class RepositoryTest {
    static void main() {
        DatabaseRepository databaseRepository = new DatabaseRepository();
        databaseRepository.save();
    }
}
