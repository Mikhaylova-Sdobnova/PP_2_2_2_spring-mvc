package web.Model;

import java.util.Objects;

public class Car {
    private String model;
    private int series;
    private String driverName;

    public Car() {}

    public Car(String model, int series, String driverName) {
        this.model = model;
        this.series = series;
        this.driverName = driverName;
    }


    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getDriverName() {
        return driverName;
    }

    public void setDriverName(String driverName) {
        this.driverName = driverName;
    }

    public int getSeries() {
        return series;
    }

    public void setSeries(int series) {
        this.series = series;
    }

    @Override
    public String toString() {
        return "Car{" +
                "model='" + model + '\'' +
                ", series=" + series +
                ", driverName='" + driverName + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Car car = (Car) o;
        return series == car.series && Objects.equals(model, car.model) && Objects.equals(driverName, car.driverName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(model, series, driverName);
    }
}