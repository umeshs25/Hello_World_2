import java.awt.*;

public class Car {
    double avgMilesPerGalloon;
    String LicensePlate;
    Color paintColor;
    boolean areTailingWorking;

    public Car(double inputAverageMPG,
               String inputLicensePlate,
               Color inputpaintColor,
               boolean inputAreTailingWorking){
        this.avgMilesPerGalloon= inputAverageMPG;
        this.LicensePlate = inputLicensePlate;
        this.paintColor = inputpaintColor;
        this.areTailingWorking = inputAreTailingWorking;
    }

}
