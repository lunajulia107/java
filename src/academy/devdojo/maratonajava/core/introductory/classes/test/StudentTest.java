package devdojo.maratonajava.core.introductory.classes.test;

import devdojo.maratonajava.core.introductory.classes.domain.Student;

public class StudentTest {
    static void main() {
        // Variável de ref | Objeto
        Student student = new Student();
        student.name = "Manuela";
        student.age = 10;
        student.sexo = 'F';

        System.out.println(student.name);

        // Varável de refência ligada ao objeto
        Student student1 = new Student();
        // Objetos não inicializados
        System.out.println(student1.name); // null
        System.out.println(student1.age); // 0
        System.out.println(student1.sexo); // vazio
    }
}
