package devdojo.maratonajava.core.introduction.abstractclasses.domain;

public class Developer extends Employee {
    public Developer(String name, double salary) {
        super(name, salary);
    }

    @Override
    public String toString() {
        return "Developer{" +
                "name='" + name + '\'' +
                ", salary=" + salary +
                '}';
    }

    @Override
    public void calculateBonus() {
        this.salary = this.salary + this.salary * 0.05;
    }

    @Override
    public void printer() {

    }
}
