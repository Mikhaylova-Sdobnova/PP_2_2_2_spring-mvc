package web.Service;

import web.Model.Car;

import java.util.ArrayList;
import java.util.List;

public class CarService {

    public static List<Car> defaultCarList() {
        List<Car> cars = new ArrayList<>();

        cars.add(new Car("BMW",45865,"Oleg"));
        cars.add(new Car("AUDI",35452,"Olga"));
        cars.add(new Car("Rolls_Royce",11111,"Konstantin"));
        cars.add(new Car("Nissan",45248,"Marya"));
        cars.add(new Car("Cadillac",87524,"50 Cent"));

        return cars;
    }
}
