package us.google.maxsir.oop.task;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Searcher {

    private File appliancesFile = new File("appliances_db.txt");


    public Searcher() {    }

    public Searcher(File appliancesFile) {
        this.appliancesFile = appliancesFile;
    }


    public void outputByName(String applianceName) {
        List<String> appliancesInfos = fileParser(applianceName);

        for (String applianceInfo : appliancesInfos) {
            System.out.println(applianceInfo);
        }
    }

    private List<String> fileParser(String applianceName) {
        List<String> appliancesInfos = new ArrayList<>();

        try {
            FileReader fr = new FileReader(appliancesFile);
            Scanner scanner = new Scanner(fr);
            String applianceInfo;
            String currentLineApplianceName;

            while (scanner.hasNext()) {
                applianceInfo = scanner.nextLine();
                currentLineApplianceName = applianceInfo.substring(0, applianceName.length());

                if (currentLineApplianceName.equals(applianceName)) {
                    appliancesInfos.add(applianceInfo);
                }
            }

            fr.close();
            scanner.close();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            return appliancesInfos;
        }
    }

    public void theCheapestApplianceOutput() {
        System.out.println(theCheapestApplianceSearch());
    }

    private String theCheapestApplianceSearch() {
        String applianceInfo = null;
        double lowestPrice;

        try {
            FileReader fr = new FileReader(appliancesFile);
            Scanner scanner = new Scanner(fr);

            if (scanner.hasNext()) {
                applianceInfo = scanner.nextLine();
                lowestPrice = appliancePrice(applianceInfo);

                double currentPrice;
                String currentApplianceInfo;

                while (scanner.hasNext()) {
                    currentApplianceInfo = scanner.nextLine();
                    currentPrice = appliancePrice(currentApplianceInfo);

                    if (currentPrice < lowestPrice) {
                        applianceInfo = currentApplianceInfo;
                        lowestPrice = currentPrice;
                    }
                }
            } else {
                return null;
            }

            fr.close();
            scanner.close();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            return applianceInfo;
        }
    }

    private double appliancePrice(String applianceInfo) {
        String[] applianceProperties = applianceInfo.split(",");
        String propertySubstr;
        double appliancePrice;

        for (String applianceProperty : applianceProperties) {

            propertySubstr = applianceProperty.substring(1, 6);
            if (propertySubstr.equals("PRICE")) {
                appliancePrice = Double.valueOf(applianceProperty.substring(7));
                return appliancePrice;
            }
        }

        return -1.0;
    }
}
