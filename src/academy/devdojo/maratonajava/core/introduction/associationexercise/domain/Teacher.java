package devdojo.maratonajava.core.introduction.associationexercise.domain;

public class Teacher {
    private String name;
    private String speciality;
    private Seminar[] seminars;

    public Teacher(String name, String speciality) {
        this.name = name;
        this.speciality = speciality;
    }

    public Teacher(String name, String speciality, Seminar[] seminars) {
        this(name, speciality);
        this.seminars = seminars;
    }

    public void printer() {
        System.out.println("----------");
        System.out.println("Professor: " + this.name + " - " + this.speciality);

        if (this.seminars == null) return;
        for (Seminar seminar: this.seminars) {
            System.out.println("Seminários:");
            System.out.println(seminar.getTitle());
            System.out.println(seminar.getLocation().getAddress());


            if (seminar.getStudents() == null) return;
            System.out.println("Alunos:");
            for (Student student : seminar.getStudents()) {
                System.out.println(student.getName() + ", " + student.getAge());
            }
            System.out.println("----------");
        }
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSpeciality() {
        return speciality;
    }

    public void setSpeciality(String speciality) {
        this.speciality = speciality;
    }

    public Seminar[] getSeminars() {
        return seminars;
    }

    public void setSeminars(Seminar[] seminars) {
        this.seminars = seminars;
    }
}
