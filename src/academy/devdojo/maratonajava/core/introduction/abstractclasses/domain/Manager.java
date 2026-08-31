package devdojo.maratonajava.core.introduction.abstractclasses.domain;

import devdojo.maratonajava.core.introduction.abstractclasses.domain.Employee;

public class Manager extends Employee {
    public Manager(String name, double salary) {
        super(name, salary);
    }

    @Override
    public void calculateBonus() {
        this.salary = this.salary + this.salary * 0.1;
    }

    @Override
    public void printer() {

    }
}

