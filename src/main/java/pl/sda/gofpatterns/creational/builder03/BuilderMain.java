package pl.sda.gofpatterns.creational.builder03;

public class BuilderMain {
    public static void main(String[] args) {
        VehicleBuilder builder = new AmericanVehicleBuilder();
        builder.setTank(100).addWheel().addWheel().addWheel();
        Vehicle vehicle = builder.build();
        System.out.println(vehicle);
        builder.addWheel();
        System.out.println(vehicle);
        System.out.println(vehicle);
        Vehicle vehicle2 = builder.build();


        System.out.println(vehicle2);

    }
}
