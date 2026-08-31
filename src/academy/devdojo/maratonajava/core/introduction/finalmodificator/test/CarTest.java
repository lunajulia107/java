package devdojo.maratonajava.core.introduction.finalmodificator.test;

import devdojo.maratonajava.core.introduction.finalmodificator.domain.Car;
import devdojo.maratonajava.core.introduction.finalmodificator.domain.Ferrari;

public class CarTest {
    static void main() {
        Car car = new Car();
        System.out.println("Velocidade: " + car.SPEED_LIMIT);
        System.out.println(car.BUYER);
        // Sigleton pattern
        car.BUYER.setName("Julia");
        System.out.println(car.BUYER);

        Ferrari ferrari = new Ferrari();
        ferrari.setName("Gustavo");
        ferrari.printer();
    }
}
