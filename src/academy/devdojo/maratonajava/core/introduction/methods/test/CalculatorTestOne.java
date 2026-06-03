package devdojo.maratonajava.core.introduction.methods.test;

import devdojo.maratonajava.core.introduction.methods.domain.Calculator;

public class CalculatorTestOne {
    static void main() {
        Calculator calculator = new Calculator();
        int[] numbers = {1,2,3,4,5};
        calculator.addArray(numbers);
        calculator.addVarArgs(1,2,3,4,5,6,7,8,9,10); // varargs é um array
    }
}
