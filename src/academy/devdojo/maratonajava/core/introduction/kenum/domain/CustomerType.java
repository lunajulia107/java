package devdojo.maratonajava.core.introduction.kenum.domain;

// Enumeração
// Uma escolha dentro de uma quantidade limitada de opções
public enum CustomerType {
    PESSOA_FISICA(1, "Pessoa Física"),
    PESSOA_JURIDICA(2, "Pessoa Jurídica");

    public final int value;
    public String reportName;
    CustomerType(int value, String reportName) {
        this.value = value;
        this.reportName = reportName;
    }

    public static CustomerType customerTypeByNameReport(String reportName) {
        for (CustomerType customerType : values()) {
            if (customerType.getReportName().equals(reportName)) {
                return customerType;
            }
        }
        return null;
    }

    public String getReportName() {
        return reportName;
    }

    public int getValue() {
        return value;
    }
}
