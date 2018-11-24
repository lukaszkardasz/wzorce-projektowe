package pl.sda.gofpatterns.creational.builder;

import java.util.ArrayList;
import java.util.List;

public class AmericanVehicleBuilder implements VehicleBuilder {
    private int size;
    private List<Wheel> wheelList = new ArrayList<Wheel>();
    public Vehicle build() {
        return new Vehicle(size, new ArrayList<Wheel>(wheelList));
    }

    public void addWheel() {
        wheelList.add(new Wheel(23));
    }

    public void setTank(int size) {
        this.size = size * 2;
    }
}
