package devdojo.maratonajava.core.introductory.staticmodificators.domain;

public class Car {
    private String name;
    private double maximumSpeed;
    // Modificador de acesso -> static existe a possibilidade de não existir um objeto em memória
    private static double limitSpeed = 250;

    public Car(
            String name,
            double maximumSpeed
    ) {
        this.name = name;
        this.maximumSpeed = maximumSpeed;
    }

    public void print() {
        System.out.println("--------------");
        System.out.println("Nome: " + this.name);
        System.out.println("Velocidade máxima: " + this.maximumSpeed);
        System.out.println("Velocidade limite: " + Car.limitSpeed);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getMaximumSpeed() {
        return maximumSpeed;
    }

    public void setMaximumSpeed(double maximumSpeed) {
        this.maximumSpeed = maximumSpeed;
    }

    public static double getSpeedLimit() {
        return Car.limitSpeed;
    }

    public static void setSpeedLimit(double limitSpeed) {
        Car.limitSpeed = limitSpeed;
    }
}
