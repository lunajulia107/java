package devdojo.maratonajava.core.introduction.classes.test;

import devdojo.maratonajava.core.introduction.classes.domain.Car;

public class CarTest {
    static void main() {
        Car carOne = new Car();
        carOne.model = "Sport";
        carOne.name = "Fusca JS";
        carOne.year = 1979;

        Car carTwo = new Car();
        carTwo.model = "GT 500";
        carTwo.name = "Mustang";
        carTwo.year = 2000;
        // Objetivos do mesmo tipo
        carOne = carTwo;

        System.out.println(carOne.name + "\n" + carOne.year + "\n");
        System.out.println(carTwo.name + "\n" + carTwo.year);
    }
}
