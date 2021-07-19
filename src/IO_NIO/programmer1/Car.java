package IO_NIO.programmer1;

import java.io.Serializable;

public class Car implements Serializable {
    String model;
    String color;


    public Car(String model , String color) {
        this.color = color;
        this.model = model;
    }

    @Override
    public String toString() {
        return "Car{" +
                "model='" + model + '\'' +
                ", color='" + color + '\'' +
                '}';
    }
}
