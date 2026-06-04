package devdojo.maratonajava.core.introduction.methods.test;

import devdojo.maratonajava.core.introduction.methods.domain.Employee;

public class EmployeeTest {
    static void main() {
        Employee employee = new Employee();

        employee.setName("Julia");
        employee.setAge(21);
        employee.setSalaries(new double[]{4500, 2000, 3000});

        employee.printer();
    }
}
