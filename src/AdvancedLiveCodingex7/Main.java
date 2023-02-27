package AdvancedLiveCodingex7;

import java.util.List;

/**
 *Create a Manufacturer class that will contain fields: name, year of establishment, country.
 * Include all necessary methods and constructor parameters. Implement the hashCode() and equals() methods.
 * Create a Car class that will contain fields: name, model, price, year of manufacture, manufacturer list (Manufacturer),
 * and engine type (represented as the enum class, e.g. V12, V8, V6, S6, S4, S3). Include all necessary methods and constructor parameters.
 * Implement the hashcode() and equals() methods.
 *
 */
public class Main {
    public static void main(String[] args) {

        CarService carService = new CarService();

        Manufacturer manufacturer1 = new Manufacturer("BMW",1960,"Germany");
        Manufacturer manufacturer2 = new Manufacturer("Ford",1945,"America");
        Manufacturer manufacturer3 = new Manufacturer("Toyota",1960,"Japan");

        Car car1 = new Car("BMW","M2",380.00,2018, List.of(manufacturer1),EngineType.V8);
        Car car2 = new Car("BMW","M4",480.00,2014, List.of(manufacturer1),EngineType.V6);
        Car car3 = new Car("BMW","M2",380.32,2023, List.of(manufacturer1),EngineType.V8);
        Car car4 = new Car("BMW","M3",380.00,2018, List.of(manufacturer1),EngineType.V12);
        Car car5 = new Car("BMW","M5",2280.20,2044, List.of(manufacturer1, manufacturer2, manufacturer3),EngineType.S3);
        Car car6 = new Car("BMW","M6",3440.432,2055, List.of(manufacturer1),EngineType.V8);
        Car car7 = new Car("BMW","M8",322.05,2018, List.of(manufacturer1),EngineType.S6);

        carService.addCars(car1);
        carService.addCars(car2);
        carService.addCars(car3);
        carService.addCars(car4);
        carService.addCars(car5);
        carService.addCars(car6);
        carService.addCars(car7);

        System.out.println("Get all cars------------------------");
        System.out.println(carService.getAllCars());
        System.out.println("Remove car ------------------------");
        carService.removeCar(car4);
        System.out.println(carService.getAllCars());
        System.out.println("Get cars by engine type ------------------------");
        System.out.println(carService.carsWithByEngineType(EngineType.V8));
        System.out.println(("Get all cars produced before--------------"));
        System.out.println(carService.carsProducedBefore(2020));
        System.out.println("Get most expensive car----------");
        System.out.println(carService.mostExpensiveCarV2());
        System.out.println("Get cheapest car----------");
        System.out.println(carService.getCheapestCar());
        System.out.println("Get cars with at least 2 manufacturers");
        System.out.println(carService.getCarsWithMoreAtLeast3Manufacturers());


    }
}
