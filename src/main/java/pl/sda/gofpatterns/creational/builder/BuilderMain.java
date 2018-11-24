package pl.sda.gofpatterns.creational.builder;

public class BuilderMain {
    public static void main(String[] args) {
        VehicleBuilder builder = new AmericanVehicleBuilder();
        builder.setTank(100);
        builder.addWheel();
        builder.addWheel();
        builder.addWheel();
        Vehicle vehicle = builder.build();
        System.out.println(vehicle);
        builder.addWheel();
        System.out.println(vehicle);
        vehicle.getWheel().add(new Wheel(24));
        System.out.println(vehicle);
        Vehicle vehicle2 = builder.build();


        System.out.println(vehicle2);

    }
}
