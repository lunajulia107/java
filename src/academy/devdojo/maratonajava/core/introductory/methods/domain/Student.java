package devdojo.maratonajava.core.introductory.methods.domain;

public class Student {
    public String name;
    public int age;
    public char sexo;

    // Abaixa a coesão
    public void printer () {
        System.out.println("--------------");
        System.out.println(this.name);
        System.out.println(this.age);
        System.out.println(this.sexo);
    }
}
