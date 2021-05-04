package web.service;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;
import web.model.Car;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Component
@Service
public class CarService {
    private static List<Car> cars = new ArrayList<>();

    public void createCars() {
        cars.add(new Car("Lada", 2011, 1.6));
        cars.add(new Car("Tagaz", 2008, 2.0));
        cars.add(new Car("Mazda", 2000,1.4 ));
        cars.add(new Car("zaz", 2015, 1.6));
        cars.add(new Car("uaz", 1999, 4.5));
    }

    public List<Car> getCars(int count) {
        return cars.stream()
                .limit(count)
                .collect(Collectors.toList());
    }
}
