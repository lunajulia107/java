package devdojo.maratonajava.core.introduction.association.test;

import java.util.Scanner;

public class ReadDataFromKeyboardTest {
    static void main() {
        Scanner input = new Scanner(System.in);
        System.out.println("Digite seu nome: ");
        String nome = input.nextLine();
        System.out.println("Digite sua idade: ");
        int age = input.nextInt();
        System.out.println("Digite M ou F para seu sexo: ");
        char sexo = input.next().charAt(0);
        System.out.println("-----------------------------");
        System.out.println("Nome: " + nome);
        System.out.println("Idade: " + age);
        System.out.println("Sexo: " + sexo);
    }
}
