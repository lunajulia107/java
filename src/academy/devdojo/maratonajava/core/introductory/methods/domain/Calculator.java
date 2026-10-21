package devdojo.maratonajava.core.introductory.methods.domain;

public class Calculator {
    // Metodo: modificador de acesso, retorno
    // Usa CamelCase
    public void addTwoNumbers() {
        System.out.println(10 + 10);
    }

    public void subtractTwoNumbers() {
        System.out.println(10 - 20);
    }

    // Passando parâmetros
    // Metodo com mais 3 argumentos provavelmente precisa de outro
    public void multiplyTwoNumbers(int numberOne, int numberTwo) {
        System.out.println(numberOne * numberTwo);
    }

    public double divideTwoNumbers(double numberOne, double numberTwo) {
        if (numberTwo == 0) {
            return 0;
        }

        return numberOne / numberTwo;
    }

    public double divideTwoNumbersOne(double numberOne, double numberTwo) {
        if (numberTwo != 0) {
            return numberOne / numberTwo;
        }

        return 0;
    }

    public void printDivideTwoNumbers(double numberOne, double numberTwo) {
         if (numberTwo == 0) {
             System.out.println("Não existe divisão por 0.");
             return;
         }

        System.out.println(numberOne / numberTwo);
    }

    public void alterTwoNumbers(int numberOne, int numberTwo) {
        numberOne = 99;
        numberTwo = 22;

        System.out.println("Dentro do altera dois números.");
        System.out.println("Número 1 - " + numberOne);
        System.out.println("Número 2 - " + numberTwo);
    }

    public void addArray(int[] numbers) {
        int add = 0;
        for (int number : numbers) {
            add += number;
        }
        System.out.println(add);
    }

    public void addVarArgs(int...numbers) {
        int add = 0;
        for (int number : numbers) {
            add += number;
        }
        System.out.println(add);
    }
}
