package devdojo.maratonajava.core.introduction.associationexercise.domain;

public class Student {
    private String name;
    private int age;
    private Seminar seminars;

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public Student(String name, int age, Seminar seminars) {
        this(name, age);
        this.seminars = seminars;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Seminar getSeminars() {
        return seminars;
    }

    public void setSeminars(Seminar seminars) {
        this.seminars = seminars;
    }
}
