package devdojo.maratonajava.introductionTypesPrimitives;

public class Lesson02PrimitiveTypes {
    static void main() {
        // Tipos primitivos => int, double, float, char, byte, short, long, boolean
        // Númericos
        int age = (int) 10000000000L; // casting
        double doubleSalary = 3000.5;
        float floatSalary = 3500.0F;
        byte byteAge = 127;
        short shortAge = 10;
        char character = '\u0041';

        boolean booleanTrue = true;
        boolean booleanFalse = false;

        String name = "Julia Rodrigues";

        System.out.println("age"); // String
        System.out.println(age); // Variável
        System.out.println("Ela tem " + age + " anos."); // Valor
        System.out.println(character);
        System.out.println(name);
    }
}
