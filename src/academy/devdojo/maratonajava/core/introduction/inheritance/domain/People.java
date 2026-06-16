package devdojo.maratonajava.core.introduction.inheritance.domain;

public class People {
    // Classes e subclasses conseguem ter acesso (pacote)
    protected String name;
    protected String cpf;
    protected Address address;
    static {
        System.out.println("Dentro do bloco de inicialização estático de pessoa.");
    }
    {
        System.out.println("Dentro do bloco de inicialização de pessoa 1.");
    }
    {
        System.out.println("Dentro do bloco de inicialização de pessoa 2.");
    }

    public People(String name) {
        System.out.println("Dentro do construtor de pessoa.");
        this.name = name;
    }

    public void printer() {
        System.out.println("Nome: " + this.name);
        System.out.println("CPF: " + this.cpf);
        System.out.println(this.address.getStreet() + ". CEP: " + this.address.getCep() + ".");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public People(String name, String cpf, Address address) {
        this.name = name;
        this.cpf = cpf;
        this.address = address;
    }
}
