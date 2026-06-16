package devdojo.maratonajava.core.introduction.association.test;

import java.util.Scanner;

public class ReadDataFromKeyboardTwoTest {
    static void main() {
        Scanner input = new Scanner(System.in);
        System.out.println("O grande software de previsão do futuro.");
        System.out.println("Digite sua pergunta e eu responderei sim ou não:");
        String question = input.nextLine();

        if (question.charAt(0) == ' ') {
            System.out.println("SIM");
        } else {
            System.out.println("NÃO");
        }
    }
}
