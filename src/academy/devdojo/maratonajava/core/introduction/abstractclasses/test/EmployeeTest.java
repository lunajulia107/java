package devdojo.maratonajava.core.introduction.abstractclasses.test;

import devdojo.maratonajava.core.introduction.abstractclasses.domain.Developer;
import devdojo.maratonajava.core.introduction.abstractclasses.domain.Manager;

public class EmployeeTest {
    static void main() {
        Manager manager = new Manager("Carol", 10560);
        Developer developer = new Developer("Julia", 30000);
        System.out.println(manager);
        System.out.println(developer);
    }
}
