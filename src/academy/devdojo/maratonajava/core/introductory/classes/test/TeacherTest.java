package devdojo.maratonajava.core.introductory.classes.test;

import devdojo.maratonajava.core.introductory.classes.domain.Teacher;

public class TeacherTest {
    static void main() {
        Teacher teacher = new Teacher();
        teacher.name = "Israel Novaes";
        teacher.age = 56;
        teacher.sexo = 'M';

        System.out.println(teacher.name + " "  + teacher.age + " anos, sexo " + teacher.sexo + ".");
    }
}
