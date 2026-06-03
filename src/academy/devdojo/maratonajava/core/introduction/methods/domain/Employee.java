package devdojo.maratonajava.core.introduction.methods.domain;

public class Employee {
    public String name = null;
    public int age = 0;
    public double[] salaries = null;

    public void printer() {
        System.out.println("Nome: " + this.name);
        System.out.println("Idade: " + this.age);

        if (this.salaries == null) {
            return;
        }

        for (int i = 0; i < salaries.length; i++) {
            System.out.println("Salário " + i + ": " + salaries[i]);
        }

        printerAverageSalaries();
    }

    private void printerAverageSalaries() {
        double average = 0;

        for (double salary : this.salaries) {
            average += salary;
        }

        average /= this.salaries.length;
        System.out.printf("Média dos salários: %.2f%n", average);
    }
}
