package devdojo.maratonajava.core.introduction.polimorfismo.test;

import devdojo.maratonajava.core.introduction.polimorfismo.service.DatabaseRepository;

public class RepositoryTest {
    static void main() {
        DatabaseRepository databaseRepository = new DatabaseRepository();
        databaseRepository.save();
    }
}
