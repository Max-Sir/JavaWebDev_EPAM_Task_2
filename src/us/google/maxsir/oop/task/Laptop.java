package us.google.maxsir.oop.task;

public class Laptop implements java.io.Serializable{
    double batteryCapacity;
    String os;
    int memoryRom,systemMemory;
    double cpu;
    int displayInches;
    double price;

    public Laptop(double batteryCapacity, String os, int memoryRom, int systemMemory, double cpu, int displayInches, double price) {
        this.batteryCapacity = batteryCapacity;
        this.os = os;
        this.memoryRom = memoryRom;
        this.systemMemory = systemMemory;
        this.cpu = cpu;
        this.displayInches = displayInches;
        this.price = price;
    }

    @Override
    public String toString() {
        return "Laptop : " +
                "batteryCapacity=" + batteryCapacity +
                ", os='" + os + '\'' +
                ", memoryRom=" + memoryRom +
                ", systemMemory=" + systemMemory +
                ", cpu=" + cpu +
                ", displayInches=" + displayInches +
                ", price=" + price ;
    }
}
