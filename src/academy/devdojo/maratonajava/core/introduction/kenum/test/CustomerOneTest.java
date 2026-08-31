package devdojo.maratonajava.core.introduction.kenum.test;

import devdojo.maratonajava.core.introduction.kenum.domain.CustomerOne;
import devdojo.maratonajava.core.introduction.kenum.domain.CustomerType;
import devdojo.maratonajava.core.introduction.kenum.domain.CustomerOne.PaymentType;

public class CustomerOneTest {
    static void main() {
        // Por conta da insconsistência de dados usamos enum
        CustomerOne customerOne = new CustomerOne("Julia", CustomerType.PESSOA_FISICA, PaymentType.DEBITO);
        CustomerOne customerTwo = new CustomerOne("Bruno", CustomerType.PESSOA_FISICA, PaymentType.DEBITO);
        System.out.println(customerOne);
        System.out.println(customerTwo);
    }
}
