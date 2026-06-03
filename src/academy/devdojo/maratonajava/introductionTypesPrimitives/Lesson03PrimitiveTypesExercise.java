package devdojo.maratonajava.introductionTypesPrimitives;

/*
    Prática
    Crie variáveis para os campos descritos abaixo entre <> e imprima a seguinte mensagem:

    Eu <nome>, morando no endereço <endereço>, confirmo que recebi
    o salário de <salário>, na data <data>.
 */
public class Lesson03PrimitiveTypesExercise {
    static void main() {
        String name = "Julia Rodrigues Gomes";
        String address = "Rua Tomé de Souza, 97";
        double salary = 2000.00;
        String receiptSalaryDate = "30/03/2026";

        String report = "Eu " + name + ", morando no endereço " + address + ", confirmo que recebi o salário de " + salary + ", na data " + receiptSalaryDate +".";
        System.out.println(report);
    }
}
