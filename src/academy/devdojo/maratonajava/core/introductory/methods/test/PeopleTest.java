package devdojo.maratonajava.core.introductory.methods.test;

import devdojo.maratonajava.core.introductory.methods.domain.People;

public class PeopleTest {
    static void main() {
        People people = new People();
        // Aclopamento o quanto uma classe sabe da outra.
        people.setName("Valdelice");
        people.setAge(56);

        people.printer();
    }
}
