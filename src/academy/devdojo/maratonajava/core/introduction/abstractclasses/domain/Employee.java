package devdojo.maratonajava.core.introduction.abstractclasses.domain;

// Pode ter métodos tantos concretos ou abstratos
public abstract class Employee extends People {
    protected String name;
    protected double salary;

    public Employee(String name, double salary) {
        this.name = name;
        this.salary = salary;
        calculateBonus();
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", salary=" + salary +
                '}';
    }

    // métodos abstratos só podem existir dentro de classes abstratas
    public abstract void calculateBonus();
}
