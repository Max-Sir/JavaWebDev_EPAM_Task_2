package us.google.maxsir.oop.task;

public class Refrigerator implements java.io.Serializable {
    int powerConsumption, weight, freezerCapacity;
    double overallCapacity, height, width, price;

    public Refrigerator(int powerConsumption, int weight, int freezerCapacity, double overallCapacity, double height, double width, double price) {
        this.powerConsumption = powerConsumption;
        this.weight = weight;
        this.freezerCapacity = freezerCapacity;
        this.overallCapacity = overallCapacity;
        this.height = height;
        this.width = width;
        this.price = price;
    }

    @Override
    public String toString() {
        return "Refrigerator : " +
                "powerConsumption=" + powerConsumption +
                ", weight=" + weight +
                ", freezerCapacity=" + freezerCapacity +
                ", overallCapacity=" + overallCapacity +
                ", height=" + height +
                ", width=" + width +
                ", price=" + price;
    }
}
