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

        ArrayList<Car> cars = new ArrayList<>();
        cars.add(c1);
        cars.add(c2);

        ArrayList<Trucks> trucks = new ArrayList<>();
        trucks.add(t1);
        trucks.add(t2);

        ArrayList<Bus> buses = new ArrayList<>();
        buses.add(b1);
        buses.add(b2);

        ArrayList<Driver> drivers = new ArrayList<>();
        drivers.add(dc1);
        drivers.add(dc2);
        drivers.add(dt1);
        drivers.add(dt2);
        drivers.add(db1);
        drivers.add(db2);
    }
}
