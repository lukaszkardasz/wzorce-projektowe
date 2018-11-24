package pl.sda.gofpatterns.creational.builder03;

public interface VehicleBuilder {
    Vehicle build();
    VehicleBuilder addWheel();
    VehicleBuilder setTank(int size);
}
