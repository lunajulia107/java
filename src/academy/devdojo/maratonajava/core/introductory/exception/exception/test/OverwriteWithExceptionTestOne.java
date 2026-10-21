package devdojo.maratonajava.core.introductory.exception.exception.test;

import devdojo.maratonajava.core.introductory.exception.exception.domain.Employee;
import devdojo.maratonajava.core.introductory.exception.exception.domain.InvalidLoginException;
import devdojo.maratonajava.core.introductory.exception.exception.domain.People;

import java.io.FileNotFoundException;

public class OverwriteWithExceptionTestOne {
    static void main() throws InvalidLoginException, FileNotFoundException {
        People people = new People();
        Employee employee = new Employee();

        employee.save();
    }
}
