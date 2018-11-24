package pl.sda.gofpatterns.creational.prototype04;

public class PrototypeMain {
    public static void main(String[] args) throws CloneNotSupportedException {
        PrototypeComputerBuilder builder = new PrototypeComputerBuilder();
        Computer computer1 = builder.build();
        Computer computer2 = builder.build();
        System.out.println(computer1 == computer2);
        System.out.println(computer1);
        System.out.println(computer2);
    }
}
