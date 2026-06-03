package devdojo.maratonajava.core.introduction.methods.test;

import devdojo.maratonajava.core.introduction.methods.domain.Student;

import static devdojo.maratonajava.core.introduction.methods.domain.StudentPrinter.*;

public class StudentTest {
    static void main() {
        Student studentOne = new Student();
        Student studentTwo = new Student();

        studentOne.name = "Midoriya";
        studentOne.age = 15;
        studentOne.sexo = 'M';
        studentTwo.name = "Sakura";
        studentTwo.age = 16;
        studentTwo.sexo = 'F';

        printer(studentOne);
        printer(studentTwo);

        printer(studentOne);
        printer(studentTwo);
    }
}
