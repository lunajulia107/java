package devdojo.maratonajava.core.introduction.methods.domain;

public class Employee {
    private String name;
    private int age;
    private double[] salaries;
    private double average;

    public void printer() {
        System.out.println("Nome: " + name);
        System.out.println("Idade: " + age);

        if (salaries == null) {
            return;
        }

        for (int i = 0; i < salaries.length; i++) {
            System.out.println("Salário " + i + ": " + salaries[i]);
        }

        printerAverageSalaries();
    }

    private void printerAverageSalaries() {
        for (double salary : salaries) {
            average += salary;
        }

        average /= salaries.length;
        System.out.printf("Média dos salários: %.2f%n", average);
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

    public double[] getSalaries() {
        return salaries;
    }

    public void setSalaries(double[] salaries) {
        this.salaries = salaries;
    }

    public double getAverage() {
        return average;
    }
}
