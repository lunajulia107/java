package devdojo.maratonajava.core.introductory.inheritance.test;

import devdojo.maratonajava.core.introductory.inheritance.domain.Employee;

public class InheritanceTest1 {
    static void main() {
        // 0 - Bloco de inicialização estático da super classe é executado quando a JVM carregar a classe pai
        // 1 - Bloco de inicialização da subclasse é executado quando a JVM carregar a classe filha
        // 2 - Alocado o espaço em memória para objeto da super classe
        // 3 - Cada atributo de super classe é criado e inicializado com os valores default e o que for passado
        // 4 - Bloco de inicialização da super classe é executado na ordem que aparece
        // 5 - Construtor da super classe é executado
        // 6 - Alocado espaço em memória pro objeto da subclasse
        // 7 - Cada atributo de subclasse é criado e inicializado com os valores default e o que for passado
        // 8 - Bloco de inicialização da subclasse é executado na ordem que aparece
        // 9 - Construtor da sub classe é executado

        Employee employee = new Employee("Valdelice");
    }
}
