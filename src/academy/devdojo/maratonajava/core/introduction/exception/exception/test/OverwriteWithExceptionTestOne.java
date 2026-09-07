package devdojo.maratonajava.core.introduction.exception.exception.test;

import devdojo.maratonajava.core.introduction.exception.exception.domain.Employee;
import devdojo.maratonajava.core.introduction.exception.exception.domain.People;

public class OverwriteWithExceptionTestOne {
    static void main() {
        People people = new People();
        Employee employee = new Employee();

        employee.save();
    }
}
