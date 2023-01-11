package driver;

public class DriverB extends Driver {
    public DriverB(String fio, DriverLicense driverLicense) {
        super(fio, driverLicense);

        if (driverLicense != driverLicense.B){
            System.out.println("Warning: License does not match");
        }
    }


}