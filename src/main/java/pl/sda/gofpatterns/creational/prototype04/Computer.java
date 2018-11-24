package pl.sda.gofpatterns.creational.prototype04;

public class Computer implements Cloneable{
    private final String processorType;
    private final Integer memorySize;
    private final Integer diskSize;
    //konstruktor
    public Computer(String processorType, Integer memorySize, Integer diskSize) {
        this.processorType = processorType;
        this.memorySize = memorySize;
        this.diskSize = diskSize;
    }
    //3 gettery
    public String getProcessorType() {
        return processorType;
    }

    public Integer getMemorySize() {
        return memorySize;
    }

    public Integer getDiskSize() {
        return diskSize;
    }
    //toString
    @Override
    public String toString() {
        return "Computer{" +
                "processorType='" + processorType + '\'' +
                ", memorySize=" + memorySize +
                ", diskSize=" + diskSize +
                '}';
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return new Computer(processorType, memorySize, diskSize);
    }
}
