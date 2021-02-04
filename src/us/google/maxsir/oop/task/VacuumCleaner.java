package us.google.maxsir.oop.task;

public class VacuumCleaner implements java.io.Serializable {
    int powerConsumption;
    String filterType,bagType,wandType;
    int motorSpeedRegulation,cleaningWidth;
    double price;

    public VacuumCleaner(int powerConsumption, String filterType, String bagType, String wandType, int motorSpeedRegulation, int cleaningWidth, double price) {
        this.powerConsumption = powerConsumption;
        this.filterType = filterType;
        this.bagType = bagType;
        this.wandType = wandType;
        this.motorSpeedRegulation = motorSpeedRegulation;
        this.cleaningWidth = cleaningWidth;
        this.price = price;
    }

    @Override
    public String toString() {
        return "VacuumCleaner : " +
                "powerConsumption=" + powerConsumption +
                ", filterType='" + filterType + '\'' +
                ", bagType='" + bagType + '\'' +
                ", wandType='" + wandType + '\'' +
                ", motorSpeedRegulation=" + motorSpeedRegulation +
                ", cleaningWidth=" + cleaningWidth +
                ", price=" + price ;
    }
}
