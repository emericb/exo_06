package service;

import entity.Car;
import jakarta.enterprise.context.ApplicationScoped;

import java.util.List;
import java.util.Optional;

@ApplicationScoped
public class CarService {
    private List<Car> cars;

    public CarService() {
        cars = List.of(
                new Car(1L, "Renault", 2000, "Blue"),
                new Car(2L, "Peugeot", 2005, "Red"),
                new Car(3L, "Citroën", 2010, "White"),
                new Car(4L, "Volkswagen", 2015, "Black"),
                new Car(5L, "BMW", 2020, "Grey"),
                new Car(6L, "Mercedes", 2025, "Silver"),
                new Car(7L, "Audi", 2030, "Green")
        );
    }

    public List<Car> getCars() {
        return cars;
    }

    public Optional<Car> getCarById(Long id) {
        return cars.stream().filter(car -> car.getId().equals(id)).findFirst();
    }
}