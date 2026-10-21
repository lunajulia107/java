package devdojo.maratonajava.core.introductory.methods.domain;

public class StudentPrinter {
    public static void printer(Student student) {
        System.out.println("--------------");
        System.out.println(student.name);
        System.out.println(student.age);
        System.out.println(student.sexo);

        student.name = "Gohan";
    }
}
