package web.repository;

import web.model.Car;

import java.util.List;

/**
 * @author Guliamov Rustam
 */
public interface CarRepository {

    List<Car> getCars(int carNumber);
}
