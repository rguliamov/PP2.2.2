package web.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import web.model.Car;
import web.repository.CarRepository;

import java.util.List;

/**
 * @author Guliamov Rustam
 */
@Service
public class CarServiceImpl implements CarService {

    @Autowired
    private CarRepository carRepository;

    @Override
    public List<Car> getCars(int carNumber) {
        return carRepository.getCars(carNumber);
    }
}
