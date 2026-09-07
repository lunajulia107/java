package devdojo.maratonajava.core.introduction.exception.exception.domain;

import java.io.Closeable;
import java.io.IOException;

public class WriteTwo implements Closeable {
    @Override
    public void close() throws IOException {
        System.out.println("Fechando leitor 2.");
    }
}
