package devdojo.maratonajava.introductionTypesPrimitives;

public class Lesson05ConditionalStuctures06Exercise {
    static void main() {
        // Utilizando Switch e dados os valores de 1 a 7, imprima se é dia útil ou final de semana.
        // Considerando 1 como domingo.
        byte day = 7;
        String dayUtilOrNot = "";

        // char, int, byte, short, num, String
        switch (day) {
            case 1,7:
                dayUtilOrNot = "Final de semana :)";
                break;
            case 2, 3, 4, 5, 6:
                dayUtilOrNot = "Dia útil.";
                break;
            default:
                dayUtilOrNot = "Opção inválida!";
        }

        System.out.println(dayUtilOrNot);
    }
}
