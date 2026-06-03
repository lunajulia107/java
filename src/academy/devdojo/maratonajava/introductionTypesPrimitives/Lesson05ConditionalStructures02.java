package devdojo.maratonajava.introductionTypesPrimitives;

public class Lesson05ConditionalStructures02 {
    static void main() {
        // idade < 15 categoria infantil
        // idade >= 15 && idade < 18 categoria juvenil
        // idade >= 18 categoria adulto
        int idade = 17;
        String category;
        if (idade < 15) {
            category = ("Categoria Infantil");
        } else if (idade >= 15 && idade < 18) {
            category = ("Categoria Juvenil");
        } else {
            category = ("Categoria Adulto");
        }

        System.out.println(category);

        //  Código feio
        // category = idade < 15 ? "Categoria Infantil" : idade >= 15 && idade < 18 ? "Categoria Juvenil" : "Categoria Adulto";
    }
}
