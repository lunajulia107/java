package devdojo.maratonajava.introductiontypesprimitives;

public class Lesson06RepetionStructures02Exercises {
    static void main() {
        // Imprima todos os números pares de 0 até 1.000.000
        /*for (int i = 0; i <= 1000000; i++) {
            if (i % 2 == 0) {
                System.out.println("Número par: " +i);
            } else {
                System.out.println("Número ímpar: " +i);
            }
        }

        // Imprima os primeiros 25 números de um dados. Por exemplo, 50
        int maxValue = 50;

        for (int i = 0; i <= maxValue; i++) {
            if (i > 25) {break;} // para a execução e sai do laço de repetição
            System.out.println(i);
        }*/

        // Dado um valor de um carro, descubra em quantas vezes ele pode ser parcelado
        // Condição valorParcela >= 1000
        double carValue = 350000;

        for (int installment = 1; installment <= carValue; installment++) {
            double installmentValue = carValue/installment;

            if (installmentValue < 1000) {
                break;
            }

            System.out.println("Parcela " + installment + " - R$: " + String.format("%.2f", installmentValue));
        }
    }
}
