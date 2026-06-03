package devdojo.maratonajava.core.introduction.methods.test;

import devdojo.maratonajava.core.introduction.methods.domain.Calculator;

public class CalculatorTest {
    static void main() {
        Calculator calculator = new Calculator();
        calculator.addTwoNumbers();
        calculator.subtractTwoNumbers();

        System.out.println("-----------");
        calculator.multiplyTwoNumbers(7, 7);

        System.out.println("-----------");
        System.out.println(calculator.divideTwoNumbers(20, 2));
        System.out.println(calculator.divideTwoNumbersOne(20, 0));

        System.out.println("-----------");
        calculator.printDivideTwoNumbers(59, 0);

        System.out.println("-----------");
        int numberOne = 22;
        int numberTwo = 11;
        calculator.alterTwoNumbers(numberOne, numberTwo);
        System.out.println("-----------");
        System.out.println("Dentro do altera dois números.");
        System.out.println("Número 1 - " + numberOne);
        System.out.println("Número 2 - " + numberTwo);
    }
}
