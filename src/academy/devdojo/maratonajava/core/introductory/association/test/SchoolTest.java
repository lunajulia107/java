package devdojo.maratonajava.core.introductory.association.test;

import devdojo.maratonajava.core.introductory.association.domain.School;
import devdojo.maratonajava.core.introductory.association.domain.Teacher;

public class SchoolTest {
    static void main() {
        Teacher teacherOne = new Teacher("Kimura");
        Teacher teacherTwo = new Teacher("Kakashi");
        Teacher[] teachers = {teacherOne, teacherTwo};
        School school = new School("ArtStation", teachers);

        school.printer();
    }
}
