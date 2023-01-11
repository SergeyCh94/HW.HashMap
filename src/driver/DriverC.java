package driver;

public class DriverC extends Driver {
    public DriverC(String fio, DriverLicense driverLicense) {
        super(fio, driverLicense);

        if (driverLicense != driverLicense.C){
            System.out.println("Warning: License does not match");
        }
    }
}
