package devdojo.maratonajava.core.intermediary.jenum.domain;

public class CustomerOne {
    public enum PaymentType {
        CREDITO,
        DEBITO
    }
    private String name;
    private CustomerType customerType;
    private PaymentType paymentType;

    public CustomerOne(String name, CustomerType customerType, PaymentType paymentType) {
        this.name = name;
        this.customerType = customerType;
        this.paymentType = paymentType;
    }

    @Override
    public String toString() {
        return "CustomerOne{" +
                "name='" + name + '\'' +
                ", customerType=" + customerType.getReportName() +
                ", customerTypeInt=" + customerType.getValue() +
                ", paymentType=" + paymentType +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public CustomerType getClientType() {
        return customerType;
    }

    public void setClientType(CustomerType clientType) {
        this.customerType = clientType;
    }

    public PaymentType getPaymentType() {
        return paymentType;
    }

    public void setPaymentType(PaymentType paymentType) {
        this.paymentType = paymentType;
    }
}
