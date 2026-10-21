package devdojo.maratonajava.core.introductory.behavior.test;

import devdojo.maratonajava.core.introductory.behavior.domain.Car;

import java.util.ArrayList;
import java.util.List;

public class BehaviorTest {
    static void main() {
        List<Car> cars = List.of(
                new Car("black", 2024),
                new Car("black", 2026),
                new Car("blue", 2025)
        );

        System.out.println(filterCarByColor(cars, "black"));
        System.out.println(filterCarByColor(cars, "red"));
        System.out.println(filterByYearBefore(cars, 2025));
    }

    private static List<Car> filterCarByColor(List<Car> cars, String color) {
        List<Car> filteredCar = new ArrayList<>();

        for (Car car : cars)
            if (color.equals("black")) {
                filteredCar.add(car);
            }

        return filteredCar;
    }

    private static List<Car> filterByYearBefore(List<Car> cars, int year) {
        List<Car> filteredCar = new ArrayList<>();

        for (Car car : cars)
            if (car.getYear() < year) {
                filteredCar.add(car);
            }

        return filteredCar;
    }
}
