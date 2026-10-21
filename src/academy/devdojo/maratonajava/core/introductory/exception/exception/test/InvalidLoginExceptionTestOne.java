package devdojo.maratonajava.core.introductory.exception.exception.test;

import devdojo.maratonajava.core.introductory.exception.exception.domain.InvalidLoginException;

import java.util.Scanner;

public class InvalidLoginExceptionTestOne {
    static void main() {
        try {
            logar();
        } catch (InvalidLoginException e) {
            throw new RuntimeException(e);
        }
    }

    private static void logar() throws InvalidLoginException {
        Scanner scanner = new Scanner(System.in);
        String usernameDB = "Goku";
        String passwordDB = "ssj";

        System.out.println("Usuário:");
        String typedUsername = scanner.nextLine();
        System.out.println("Senha:");
        String typedPassword = scanner.nextLine();

        if (!usernameDB.equals(typedUsername) || !passwordDB.equals(typedPassword)) {
            throw new InvalidLoginException("Usuário ou senha inválidos.");
        }

        System.out.println("Usuário logado com sucesso.");
    }
}
