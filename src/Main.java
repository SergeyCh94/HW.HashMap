import driver.*;
import transport.*;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) throws NullPointerException, DriverLicenseException {
        Car c1 = new Car("Lada", "Vesta", 1.7, Car.BodyType.SEDAN);
        Car c2 = new Car("Audi", "A8", 3.0, Car.BodyType.UNIVERSAL);


        Trucks t1 = new Trucks("Volvo", "FH12", 13.0, Trucks.LoadCapacity.N1);
        Trucks t2 = new Trucks("Scania", "FH12", 14.5, Trucks.LoadCapacity.N2);


        Bus b1 = new Bus("MAZ", "203", 10.0, Bus.TypeOfCapacity.BIG);
        Bus b2 = new Bus("MAZ", "205", 11.5, Bus.TypeOfCapacity.AVERAGE);

        Driver dc1 = new DriverB("NameCar1", Driver.DriverLicense.B);
        Driver dc2 = new DriverB("NameCar2", Driver.DriverLicense.B);

        Driver dt1 = new DriverC("NameTruck1", Driver.DriverLicense.C);
        Driver dt2 = new DriverC("NameTruck2", Driver.DriverLicense.C);

        Driver db1 = new DriverD("NameBus1", Driver.DriverLicense.D);
        Driver db2 = new DriverD("NameBus2", Driver.DriverLicense.D);

        Mechanic m1 = new Mechanic("NameMechanic1", Mechanic.CarCategory.CAR);
        Mechanic m2 = new Mechanic("NameMechanic1", Mechanic.CarCategory.CAR);
        Mechanic m3 = new Mechanic("NameMechanic2", Mechanic.CarCategory.TRUCK);
        Mechanic m4 = new Mechanic("NameMechanic3", Mechanic.CarCategory.BUS);

        Map<Transport, Mechanic> mechanics = new HashMap<>();
        mechanics.put(c1, m1);
        mechanics.put(t1, m3);


    }
}
