package web.service;

import web.model.Car;

import java.util.List;

/**
 * @author Guliamov Rustam
 */
public interface CarService {

    List<Car> getCars(int carNumber);
}
