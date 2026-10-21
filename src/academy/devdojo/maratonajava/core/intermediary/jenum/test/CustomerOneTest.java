package devdojo.maratonajava.core.intermediary.jenum.test;

import devdojo.maratonajava.core.intermediary.jenum.domain.CustomerOne;
import devdojo.maratonajava.core.intermediary.jenum.domain.CustomerType;
import devdojo.maratonajava.core.intermediary.jenum.domain.CustomerOne.PaymentType;

public class CustomerOneTest {
    static void main() {
        // Por conta da insconsistência de dados usamos enum
        CustomerOne customerOne = new CustomerOne("Julia", CustomerType.PESSOA_FISICA, PaymentType.DEBITO);
        CustomerOne customerTwo = new CustomerOne("Bruno", CustomerType.PESSOA_FISICA, PaymentType.DEBITO);
        System.out.println(customerOne);
        System.out.println(customerTwo);
    }
}
