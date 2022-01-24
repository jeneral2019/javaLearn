package base.exec;

import java.util.Objects;

public class LinkedHashSetExercise {

}

class Car{
    public Car(String name, double price) {
        this.name = name;
        this.price = price;
    }

    private String name;
    private double price;

    @Override
    public boolean equals(Object object) {
        if (this == object) return true;
        if (object == null || getClass() != object.getClass()) return false;
        Car car = (Car) object;
        return Double.compare(car.price, price) == 0 &&
                Objects.equals(name, car.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, price);
    }
}