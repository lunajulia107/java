package devdojo.maratonajava.core.introductory.associationexercise.test;

import devdojo.maratonajava.core.introductory.associationexercise.domain.Seminar;
import devdojo.maratonajava.core.introductory.associationexercise.domain.Student;
import devdojo.maratonajava.core.introductory.associationexercise.domain.Teacher;
import devdojo.maratonajava.core.introductory.associationexercise.domain.Location;

public class SeminarTest {
    static void main() {
        Location location = new Location("Fatec Barueri.");

        Student student = new Student("Camila", 21);
        Student studentOne = new Student("Julia", 21);
        Student studentTwo = new Student("Samara", 25);
        Student[] students = {student, studentOne, studentTwo};

        Seminar seminar = new Seminar("Plataforma Digital Para Mulheres.", students, location);
        Seminar seminarTwo = new Seminar("Plataforma Para Melhora da Gestão da Saúde.", location);
        Seminar[] seminars = {seminar, seminarTwo};

        Teacher teacher = new Teacher("Josenilson", "Design");

        teacher.setSeminars(seminars);

        teacher.printer();
    }
}
