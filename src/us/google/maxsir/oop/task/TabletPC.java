package us.google.maxsir.oop.task;

import java.io.Serializable;

public class TabletPC implements Serializable {
    double batteryCapacity;
    int displayInches;
    int memoryRom,flashMemoryMemory;
    String color;
    double price;

    public TabletPC(double batteryCapacity, int displayInches, int memoryRom, int flashMemoryMemory, String color, double price) {
        this.batteryCapacity = batteryCapacity;
        this.displayInches = displayInches;
        this.memoryRom = memoryRom;
        this.flashMemoryMemory = flashMemoryMemory;
        this.color = color;
        this.price = price;
    }

    @Override
    public String toString() {
        return "TabletPC : " +
                "batteryCapacity=" + batteryCapacity +
                ", displayInches=" + displayInches +
                ", memoryRom=" + memoryRom +
                ", flashMemoryMemory=" + flashMemoryMemory +
                ", color='" + color + '\'' +
                ", price=" + price ;
    }
}
