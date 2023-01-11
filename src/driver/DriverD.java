package driver;

public class DriverD extends Driver {
    public DriverD(String fio, DriverLicense driverLicense) {
        super(fio, driverLicense);

        if (driverLicense != driverLicense.D){
            System.out.println("Warning: License does not match");
        }
    }
}
