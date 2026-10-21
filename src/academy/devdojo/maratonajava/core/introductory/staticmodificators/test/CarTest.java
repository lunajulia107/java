package devdojo.maratonajava.core.introductory.staticmodificators.test;

import devdojo.maratonajava.core.introductory.staticmodificators.domain.Car;

public class CarTest {
    static void main() {
        Car.setSpeedLimit(180);

        Car carOne = new Car("BMW", 280);
        Car carTwo = new Car("Mercedes", 275);
        Car carThree = new Car("Audi", 290);

        carOne.print();
        carTwo.print();
        carThree.print();
    }
}
