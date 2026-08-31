package devdojo.maratonajava.core.introduction.kenum.domain;

public enum PaymentType {
    DEBITO {
        // Sobrescrita de métodos
        @Override
        public double calculateDiscount(double value) {
            return value * 0.1;
        }
    },
    CREDITO {
        @Override
        public double calculateDiscount(double value) {
            return value * 0.05;
        }
    };

    // Método abstrato não pode ter corpo
    public abstract double calculateDiscount(double value);
}