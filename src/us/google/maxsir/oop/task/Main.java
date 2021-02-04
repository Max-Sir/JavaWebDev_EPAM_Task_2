package us.google.maxsir.oop.task;

public class Main {

    public static void main(String[] args) {
        Searcher searcher = new Searcher();

        searcher.theCheapestApplianceOutput();
        searcher.outputByName(Appliances.KETTLE.getApplianceNameToFile());
    }
}
