package pl.sda.gofpatterns.creational.builder;

public interface VehicleBuilder {
    Vehicle build();
    void addWheel();
    void setTank(int size);
}
