package us.google.maxsir.oop.task;

public class Oven implements java.io.Serializable {
    int powerConsumption, weight, capacity, depth;
    double height, width, price;

    public Oven(int powerConsumption, int weight, int capacity, int depth, double height, double width, double price) {
        this.powerConsumption = powerConsumption;
        this.weight = weight;
        this.capacity = capacity;
        this.depth = depth;
        this.height = height;
        this.width = width;
        this.price = price;
    }

    @Override
    public String toString() {
        return "Oven : " +
                "powerConsumption=" + powerConsumption +
                ", weight=" + weight +
                ", capacity=" + capacity +
                ", depth=" + depth +
                ", height=" + height +
                ", width=" + width +
                ", price=" + price;
    }
}
