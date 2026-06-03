package devdojo.maratonajava.core.introduction.methods.domain;

public class Employee {
    public String name;
    public int age;
    public double[] salaries;

    public void printer() {
        System.out.println("--------------");
        System.out.println("Nome: " + this.name);
        System.out.println("Idade: " + this.age);

        for (int i = 0; i < salaries.length; i++) {
            System.out.println("Salário " + i + ": " + salaries[i]);
        }

        printerAverageSalaries();
    }

    public void printerAverageSalaries() {
        double average = 0;

        for (double salary : this.salaries) {
            average += salary;
        }

        average /= this.salaries.length;
        System.out.printf("Média dos salários: %.2f%n", average);
    }
}
