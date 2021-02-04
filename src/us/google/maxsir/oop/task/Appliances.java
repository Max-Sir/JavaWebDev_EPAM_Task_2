package us.google.maxsir.oop.task;

public enum Appliances {
    OVEN("Oven"),
    LAPTOP("Laptop"),
    REFRIGERATOR("Refrigerator"),
    VACUUM_CLEANER("VacuumCleaner"),
    TABLET_PC("TabletPC"),
    SPEAKERS("Speakers"),
    KETTLE("Kettle");

    private String applianceNameInFile;

    Appliances(String applianceNameToFile) {
        this.applianceNameInFile = applianceNameToFile;
    }

    public String getApplianceNameToFile() {
        return this.applianceNameInFile;
    }
}
