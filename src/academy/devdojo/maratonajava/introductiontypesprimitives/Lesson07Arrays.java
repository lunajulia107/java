package devdojo.maratonajava.introductiontypesprimitives;

public class Lesson07Arrays {
    static void main() {
        int[] ages = new int[3]; // array e 3 posições
        ages[0] = 19;
        ages[1] = 21;
        ages[2] = 23;

        System.out.println(ages[0]);

        // byte, short, int, long, flout e double => 0
        // char => '\u0000'
        // boolean => false
        // String => null

        String[] names = new String[4];
        names[0] = "Pikachu";
        names[1] = "Scorbunny";
        names[2] = "Eeve";
        names[3] = "Mew";

        for (int i = 0; i < names.length; i++) {
            System.out.println(names[i]);
        }

        int[] number = new int[3];
        int[] numbers = {1,2,3,4,5};
        int[] numbers1 = new int[]{1,2,3,4,5};

        /*for (int i = 0; i < numbers1.length; i++) {
            System.out.println(numbers1[i]);
        }*/

        for (int num: numbers1) {
            System.out.println(num);
        }
    }
}
