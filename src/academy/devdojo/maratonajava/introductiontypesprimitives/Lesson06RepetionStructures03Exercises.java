package devdojo.maratonajava.introductiontypesprimitives;

public class Lesson06RepetionStructures03Exercises {
    static void main() {
        // Dado um valor de um carro, descubra em quantas vezes ele pode ser parcelado
        // Condição valorParcela >= 1000
        double carValue = 30000;

        for (int installment = (int) carValue; installment >= 1; installment--) {
            double installmentValue = carValue/installment;

            if (installmentValue < 1000) {
                continue;
            }

            System.out.println("Parcela " + installment + " - R$: " + String.format("%.2f", installmentValue));
        }
    }
}
