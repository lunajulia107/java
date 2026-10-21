package devdojo.maratonajava.core.introductory.exception.exception.domain;

public class InvalidLoginException extends Exception {
    public InvalidLoginException () {
        super("Login inválido.");
    }

    public InvalidLoginException(String message) {
        super(message);
    }
}
