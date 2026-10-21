package devdojo.maratonajava.core.introductory.exception.runtime.test;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.SQLException;

public class RuntimeExceptionTestFour {
    static void main() {
        // Exceções mais genéricas sempre vem no final
        try {
            throw new RuntimeException();
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Dentro do ArrayIndexOutOfBoundsException.");
        } catch (IndexOutOfBoundsException e) {
            System.out.println("Dentro do IndexOutOfBoundsException.");
        } catch (IllegalArgumentException e) {
            System.out.println("Dentro do IllegalArgumentException.");
        } catch (RuntimeException e) {
            System.out.println("Dentro do RuntimeException.");
        }

        try {
            maybeException();
        } catch (SQLException e) {
            System.out.println("Dentro do SQLException.");
        } catch (IOException e) {
            System.out.println("Dentro do IOException.");
        }

    }

    private static void maybeException() throws SQLException, FileNotFoundException {

    }
}
