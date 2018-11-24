package pl.sda.gofpatterns.creational.prototype04;

public class PrototypeComputerBuilder {
    private static final Computer PROTOTYPE = createPrototype();

    private static Computer createPrototype() {
        System.out.println("Tworzenie komputera...");
        return new Computer("Intel i7",
                1024,
                204800);
    }

    public Computer build() throws CloneNotSupportedException {
        return (Computer) PROTOTYPE.clone();
    }
}
