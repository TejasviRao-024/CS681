package edu.umb.cs681.hw16;

import java.util.ArrayList;

public class Main {
	
	public static void main(String[] args) {

        ArrayList<Car> cars = new ArrayList<>();
        cars.add(new Car("Benz", "GLA SUV", 2020, 24, 11_000f));
        cars.add(new Car("Ford", "Mustang", 2012, 20, 9_000f));
        cars.add(new Car("Audi", "A4", 2010, 26, 5_000f));
        cars.add(new Car("Audi", "Q5", 2020, 23, 2_000f));
        cars.add(new Car("Ford", "Focus", 2006, 20, 6_000f));
        cars.add(new Car("Toyota", "Highlander", 2008, 20, 4_000f));
        cars.add(new Car("Hyundai", "Sonata", 2022, 20, 7_000f));
        
        

        Integer carMakeNum = cars
                .stream()
                .parallel()
                .map((Car car) -> car.getMake())
                .reduce(
                        0,
                        (result, make) -> ++result,
                        (finalResult, intermediateResult) -> finalResult + intermediateResult
                );

        System.out.println("Number of car makes: " + carMakeNum);

        Integer carModelNum = cars
                .stream()
                .parallel()
                .map((Car car) -> car.getModel())
                .reduce(
                        0,
                        (result, model) -> ++result,
                        (finalResult, intermediateResult) -> finalResult + intermediateResult
                );

        System.out.println("Number of car models: " + carModelNum);
    }

}
