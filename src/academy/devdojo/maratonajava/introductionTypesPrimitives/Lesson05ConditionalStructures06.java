package devdojo.maratonajava.introductionTypesPrimitives;

public class Lesson05ConditionalStructures06 {
    static void main() {
        // Imprima o dia da semana, considerando 1 como domingo
        byte day = 5;
        String wordDay = "";

        // char, int, byte, short, num, String
        switch (day) {
            case 1:
                wordDay = "Domingo";
                break;
            case 2:
                wordDay = "Segunda";
                break;
            case 3:
                wordDay = "Terça";
                break;
            case 4:
                wordDay = "Quarta";
                break;
            case 5:
                wordDay = "Quinta";
                break;
            case 6:
                wordDay = "Sexta";
                break;
            case 7:
                wordDay = "Sábado";
                break;
            default:
                wordDay = "Opção inválida!";
        }

        System.out.println(wordDay);

        char sexo = 'M';

        switch (sexo) {
            case 'M':
                System.out.println("Sexo Masculino");
                break;
            case 'F':
                System.out.println("Sexo Feminino");
                break;
            default:
                System.out.println("Opção inválida!");
        }
    }
}
