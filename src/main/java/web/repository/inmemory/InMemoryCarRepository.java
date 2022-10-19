package web.repository.inmemory;

import org.springframework.stereotype.Repository;
import web.model.Car;
import web.repository.CarRepository;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

/**
 * @author Guliamov Rustam
 */
@Repository
public class InMemoryCarRepository implements CarRepository {

    private final List<Car> cars = new ArrayList<>();
    private final int size = 5;

    public InMemoryCarRepository() {
        initRepo();
    }

    @Override
    public List<Car> getCars(int carNumber) {
        return cars.stream().limit(carNumber >= size ? size : carNumber).collect(Collectors.toList());
    }

    private void initRepo() {
        Car car1 = new Car("Toyota Corolla", "2021", "Rustam");
        Car car2 = new Car("Mazda CX-30", "2021", "Anastasiya");
        Car car3 = new Car("Toyota Prius", "2021", "Kirill");
        Car car4 = new Car("Toyota Camry", "2021", "Ivan");
        Car car5 = new Car("Toyota Camry", "2021", "Dmitry");

        cars.addAll(List.of(car1, car2, car3, car4, car5));
    }
}
