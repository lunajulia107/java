package devdojo.maratonajava.introductionTypesPrimitives;

public class Lesson06RepetionStructures01 {
    static void main() {
        // while, do while. for
        int count = 10;
        while(count < 10) {
            System.out.println(++count);
        }

        count = 0;
        do {
            System.out.println(++count + " - Dentro do DO-WHILE.");
        } while (count < 10);

        for (int i = 0; i < 10; i++) {
            System.out.println("For " +i);
        }
    }
}
