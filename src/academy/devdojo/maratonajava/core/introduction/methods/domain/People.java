package devdojo.maratonajava.core.introduction.methods.domain;

public class People {
    // Criação de atributos privados para evitar erros de atribuições de valores errados
    private String name;
    private int age;

    public void printer () {
        // Feio usar outro método dentro do objeto
        System.out.println(this.name);
        System.out.println(this.age);
    }

    // Acloplamento baixo
    // Por conta do paramêtro com nome igual ao da variável
    // o uso do this se torna obrigatório.
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
        if (age < 0) {
            System.out.println("Idade inválida!");
        }

        this.age = age;
    }
}
