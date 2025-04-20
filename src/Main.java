import java.awt.*;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello and welcome!");

        Car myCar= new Car(25.5, "CG07BS",
                Color.cyan, true);

        Car CarTwo= new Car(65.1, "CG04AN",
                Color.BLACK, false);

        System.out.println("My Car's License Plate no. is" + myCar.LicensePlate);
        System.out.println("My Car Two License Plate no. is" + CarTwo.LicensePlate);
    }
}