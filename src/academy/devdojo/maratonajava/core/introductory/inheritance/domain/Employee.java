package devdojo.maratonajava.core.introductory.inheritance.domain;

// Herança múltipla não existe
public class Employee extends People {
    private double salary;
    static {
        System.out.println("Dentro do bloco de inicialização estático de funcionário.");
    }
    {
        System.out.println("Dentro do bloco de inicialização de funcionário 1.");
    }
    {
        System.out.println("Dentro do bloco de inicialização de funcionário 2.");
    }


    public Employee(String name) {
        System.out.println("Dentro do construtor de funcionário.");
        super(name);
    }

    public void printer() {
        // Sobreescrita
        // super -> objeto mais genérico
        super.printer();
        System.out.println("Salário (R$): " + salary);
    }

    public void paymentReport() {
        System.out.println("Eu, " + this.name + " recebi o salário de " + this.salary + ".");
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }
}
