package devdojo.maratonajava.core.intermediary.jenum.test;

import devdojo.maratonajava.core.intermediary.jenum.domain.Customer;
import devdojo.maratonajava.core.intermediary.jenum.domain.CustomerType;
import devdojo.maratonajava.core.intermediary.jenum.domain.PaymentType;

public class CustomerTest {
    static void main() {
        // Por conta da insconsistência de dados usamos enum
        Customer customerOne = new Customer("Julia", CustomerType.PESSOA_FISICA, PaymentType.DEBITO);
        Customer customerTwo = new Customer("Bruno", CustomerType.PESSOA_FISICA, PaymentType.DEBITO);

        System.out.println(customerOne);
        System.out.println(customerTwo);

        System.out.println(customerTwo.getPaymentType().calculateDiscount(100));
        System.out.println(customerTwo.getPaymentType().calculateDiscount(500));

        // CustomerType customerType = CustomerType.valueOf("Pessoa Física");
        // System.out.println(customerType.getReportName());

        CustomerType customerTypeTwo = CustomerType.customerTypeByNameReport("Pessoa Física");
        System.out.println(customerTypeTwo);
    }
}
