package us.google.maxsir.oop.task;

public class Kettle implements java.io.Serializable{
    int powerConsumption,weight;
    String filters,bodyMaterial;
    int capacity;
    double height,width,price;

    public Kettle(int powerConsumption, int weight, String filters, String bodyMaterial, int capacity, double height, double width, double price) {
        this.powerConsumption = powerConsumption;
        this.weight = weight;
        this.filters = filters;
        this.bodyMaterial = bodyMaterial;
        this.capacity = capacity;
        this.height = height;
        this.width = width;
        this.price = price;
    }

    @Override
    public String toString() {
        return "Kettle : " +
                "powerConsumption=" + powerConsumption +
                ", weight=" + weight +
                ", filters='" + filters + '\'' +
                ", bodyMaterial='" + bodyMaterial + '\'' +
                ", capacity=" + capacity +
                ", height=" + height +
                ", width=" + width +
                ", price=" + price;
    }
}
