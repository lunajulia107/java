package devdojo.maratonajava.core.intermediary.wrapper.test;

public class WrapperTest {
    static void main() {
        byte byteA = 1;
        short shortA = 1;
        int integerA = 1;
        long longA = 10L;
        float floatA = 10F;
        double doubleA = 100.0;
        char charA = 'A';
        boolean booleanA = false;

        // Passar paramêtros por referência
        Byte byteB = 1;
        Short shortB = 1;
        Integer integerB = 2; // autoboxing
        Long longB = 10L;
        Float floatB = 10F;
        Double doubleB = 100.0;
        Character charB = 'B';
        Boolean booleanB = false;

        int c = integerB; // unboxing
    }
}
