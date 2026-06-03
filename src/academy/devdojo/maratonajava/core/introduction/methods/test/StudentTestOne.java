package devdojo.maratonajava.core.introduction.methods.test;

import devdojo.maratonajava.core.introduction.methods.domain.Student;

public class StudentTestOne {
    static void main() {
        Student studentOne = new Student();
        Student studentTwo = new Student();

        studentOne.name = "Midoriya";
        studentOne.age = 15;
        studentOne.sexo = 'M';
        studentTwo.name = "Sakura";
        studentTwo.age = 16;
        studentTwo.sexo = 'F';

        studentOne.printer();
        studentTwo.printer();
    }
}
