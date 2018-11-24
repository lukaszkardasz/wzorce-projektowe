package pl.sda.gofpatterns.creational.builder;

import java.util.List;

public class Vehicle {
    private final int tankSize;
    private final List<Wheel> wheel;

    public Vehicle(int tankSize, List<Wheel> wheel) {
        this.tankSize = tankSize;
        this.wheel = wheel;
    }

    public int getTankSize() {
        return tankSize;
    }

    public List<Wheel> getWheel() {
        return wheel;
    }

    @Override
    public String toString() {
        return "Vehicle{" +
                "tankSize=" + tankSize +
                ", wheel=" + wheel +
                '}';
    }
}
