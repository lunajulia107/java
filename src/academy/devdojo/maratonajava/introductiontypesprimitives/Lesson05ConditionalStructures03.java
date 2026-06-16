package devdojo.maratonajava.introductiontypesprimitives;

public class Lesson05ConditionalStructures03 {
    static void main() {
        // Doar se salário > 5000
        double salary = 3000;

        // Estrutura de um Operador Ternário
        // String result = (condition) ? true : false;
        String result = salary > 5000 ? "Eu vou doar 500 pro DevDojo" : "Ainda não tenho condições, mas vou ter!";
        System.out.println(result);
    }
}
