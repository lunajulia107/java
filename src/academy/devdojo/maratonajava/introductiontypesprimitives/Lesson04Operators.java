package devdojo.maratonajava.introductiontypesprimitives;

public class Lesson04Operators {
    static void main() {
        // Operadores Aritmédicos
        // + - / *
        int number01 = 10;
        double number02 = 20;
        double result = number01 / number02;

        System.out.println(result);

        // %
        int rest = 20 % 2;
        System.out.println(rest);

        // Operadores Booleanos
        // < > <= >= == !=
        boolean isTenSmallerThanTwenty = 10 < 20;
        boolean isTenGreaterThanTwenty = 10 > 20;
        boolean isTenSmallerOrEqualsTwenty = 10 <= 20;
        boolean isTenGreaterOrEqualsTwenty = 10 >= 20;
        boolean isTenEqualsTwenty = 10 == 10;
        boolean isTenDifferentTwenty = 10 != 10;

        System.out.println("10 é menor que 20: " + isTenSmallerThanTwenty);
        System.out.println("10 é maior que 20: " + isTenGreaterThanTwenty);
        System.out.println("10 é menor ou igual a 20: " + isTenSmallerOrEqualsTwenty);
        System.out.println("10 é maior ou igual a 20: " + isTenGreaterOrEqualsTwenty);
        System.out.println("10 é igual a 10: " + isTenEqualsTwenty);
        System.out.println("10 é diferente de 10: " + isTenDifferentTwenty);

        // Operadores Lógicos & Estrutura Condicionais
        // && (AND), || (OR), ! (NOT)
        int age = 29;
        float salary = 3500;

        boolean isWithinTheLawGreatherOrEqualsThanThirty = age >= 30 && salary >= 4612;
        boolean isWithinTheLawSmallerThanThirty = age < 30 && salary >= 3381;

        System.out.println("Dentro da Lei Maior que 30: " + isWithinTheLawGreatherOrEqualsThanThirty);
        System.out.println("Dentro da Lei Menor que 30: " + isWithinTheLawSmallerThanThirty);

        double totalCurrentAccountValue = 200;
        double totalSavingsAccountValue = 10000;
        float playstation5Value = 5000F;

        boolean isPlaystation5Purchasable = totalCurrentAccountValue > playstation5Value || totalSavingsAccountValue > playstation5Value;
        System.out.println("O PlayStation5 é comprável: " + isPlaystation5Purchasable);

        // Operadores de Atribuição
        // = += -= /= %=
        double bonus =  1800;
        bonus += 1000; // Uma forma de organizar mais o cod
        bonus -= 1000;
        bonus *= 2;
        bonus /= 2;
        bonus %= 2;
        System.out.println(bonus);

        // Operadores Unários
        int counter = 0;
        counter += 1; // contador = contador + 1;
        counter++;
        counter--;
        ++counter;
        --counter;
        int counter2 = 0;
        System.out.println(++counter2);
    }
}
