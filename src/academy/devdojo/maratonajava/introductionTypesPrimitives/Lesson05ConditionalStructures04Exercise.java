package devdojo.maratonajava.introductionTypesPrimitives;

public class Lesson05ConditionalStructures04Exercise {
    static void main() {
        // Exercício
        /*
            I want to know much I have to pay in the
            Netherlands 2026 base on my annual salary.
         */
        double salaryWork = 460.62;
        double salaryWorkYear = salaryWork * 12;

        double bracketOne = 0.3575;
        double bracketTwo = 0.3756;
        double bracketThree = 0.4950;

        double taxAmount = 0;

        if (salaryWorkYear <= 38883) {
            taxAmount = salaryWorkYear * bracketOne;

        } else if (salaryWorkYear <= 78426) {
            taxAmount = (38883 * bracketOne) +
                    ((salaryWorkYear - 38883) * bracketTwo);

        } else {
            taxAmount = (38883 * bracketOne) +
                    ((78426 - 38883) * bracketTwo) +
                    ((salaryWorkYear - 78426) * bracketThree);
        }

        System.out.println("Salário anual: € " + String.format("%.2f", salaryWorkYear));
        System.out.println("Imposto total: € " + String.format("%.2f", taxAmount));
    }
}
