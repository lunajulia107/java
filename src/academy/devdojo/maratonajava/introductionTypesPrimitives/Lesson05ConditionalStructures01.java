package devdojo.maratonajava.introductionTypesPrimitives;

public class Lesson05ConditionalStructures01 {
    static void main() {
        int age = 21;
        boolean isAuthorizedToBuyDrinks = age >= 18;

        if (isAuthorizedToBuyDrinks) {
            System.out.println("Autorizado a comprar bebida alcoólica.");
        }

        if (!isAuthorizedToBuyDrinks) {
            System.out.println("Não autorizado a comprar bebida alcoólica.");
        }

        boolean c = false;
        if (c == true) {
            System.out.println("Dentro de algo que nunca deve ser feito!");
        }
    }
}
