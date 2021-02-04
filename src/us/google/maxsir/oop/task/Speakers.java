package us.google.maxsir.oop.task;

public class Speakers implements java.io.Serializable {
    int powerConsumption, numberOfSpeakers;
    String frequencyRange;
    int cordLength;
    double price;

    public Speakers(int powerConsumption, int numberOfSpeakers, String frequencyRange, int cordLength, double price) {
        this.powerConsumption = powerConsumption;
        this.numberOfSpeakers = numberOfSpeakers;
        this.frequencyRange = frequencyRange;
        this.cordLength = cordLength;
        this.price = price;
    }

    @Override
    public String toString() {
        return "Speakers : " +
                "powerConsumption=" + powerConsumption +
                ", numberOfSpeakers=" + numberOfSpeakers +
                ", frequencyRange='" + frequencyRange + '\'' +
                ", cordLength=" + cordLength +
                ", price=" + price ;
    }
}
