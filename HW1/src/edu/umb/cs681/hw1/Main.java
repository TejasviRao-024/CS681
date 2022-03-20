package edu.umb.cs681.hw1;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
	
	public static void main(String[] args) {

        ArrayList<Car> cars = new ArrayList<>();

        Car car1 = new Car("Maserati","Levante", 2021, 16, 78500);
        Car car2 = new Car("Mercedes", "SL550", 2020, 17, 65500);
        Car car3 = new Car("Audi", "A4", 2019, 20, 35000);
        Car car4 = new Car("Ford","Mustang", 2018, 8, 40000);
        Car car5 = new Car("Hyundai", "Sonata",2022, 20, 45000);

        cars.add(car1);
        cars.add(car2);
        cars.add(car3);
        cars.add(car4);
        cars.add(car5);

        cars.forEach((Car car) -> car.setDominationCount(cars));

        List<Car> sortByPrice = cars.stream().sorted(Comparator.comparing(Car::getPrice)).collect(Collectors.toList());

        System.out.println("\n        Sorted by Price \n");
        sortByPrice.forEach((Car car) -> System.out.println( car.getMake() + ", "+car.getModel() + ": " + car.getPrice()));

        List<Car> sortByYear = cars.stream().sorted(Comparator.comparing(Car::getYear)).collect(Collectors.toList());
        System.out.println("\n           Sorted by Year \n");
        sortByYear.forEach((Car car) -> System.out.printf("%4s, %s :%6d \n", car.getMake(),car.getModel(), car.getYear()));

        List<Car> sortByMileage = cars.stream().sorted(Comparator.comparing(Car::getMileage)).collect(Collectors.toList());
        System.out.println("\n           Sorted by Mileage \n");
        sortByMileage.forEach((Car car) -> System.out.println(car.getMake() + ", "+car.getModel() + ": " + car.getMileage()));

        List<Car> sortByDomination = cars.stream().sorted(Comparator.comparing(Car::getDominationCount)).collect(Collectors.toList());
        System.out.println("\n           Sorted by Domination \n");
        sortByDomination.forEach((Car car) -> System.out.println(car.getMake() + ", "+car.getModel() + ": "+ car.getDominationCount()));

    }

}
