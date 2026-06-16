package devdojo.maratonajava.core.introduction.inheritance.test;

import devdojo.maratonajava.core.introduction.inheritance.domain.Address;
import devdojo.maratonajava.core.introduction.inheritance.domain.Employee;
import devdojo.maratonajava.core.introduction.inheritance.domain.People;

public class InheritanceTest {
    static void main() {
        Address address = new Address("Endereço: Rua Tomé de Souza, 97", "06462-040");
        People people = new People("Julia", "045.885.453-02", address);

        people.printer();
        System.out.println("---------------");

        // Herança: Extender a funcionalidade de uma classe mantendo relacionamento entre as classes (acopla o código)
        //
        Employee employee = new Employee("Valdelice");
        employee.setCpf("325.318.773-04");
        employee.setAddress(address);
        employee.setSalary(3000);
        employee.printer();
        employee.paymentReport();
    }
}
