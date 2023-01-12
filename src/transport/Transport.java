package transport;
import driver.Driver;
import driver.DriverLicenseException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

public abstract class Transport<T> implements Competing {
    private final String brand;
    private final String model;
    private final double engineVolume;

    private Mechanic mechanic;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Transport<?> transport = (Transport<?>) o;
        return Double.compare(transport.engineVolume, engineVolume) == 0 && brand.equals(transport.brand) && model.equals(transport.model) && mechanic.equals(transport.mechanic);
    }

    @Override
    public int hashCode() {
        return Objects.hash(brand, model, engineVolume, mechanic);
    }

    public Transport(String brand, String model, double engineVolume) {
        if (brand == null || brand.isEmpty() || brand.isBlank()){
            this.brand = "default";
        } else {
            this.brand = brand;
        }

        if (model == null || model.isEmpty() || model.isBlank()){
            this.model = "default";
        } else {
            this.model = model;
        }

        if (engineVolume <= 0) {
            this.engineVolume = 1.5;
        } else {
            this.engineVolume = engineVolume;
        }

        this.mechanic = mechanic;
    }

    public void start(Driver driver) throws DriverLicenseException {

        if (driver.getDriverLicense() == null){
            throw new DriverLicenseException("Забыли водителя");
        } else {
            System.out.println("Водитель " + driver.getFio() + " управляет автомобилем " +  getBrand() + " " + getModel() +
                    " и будет участвовать в заезде");
        }
    }

    public abstract void printType();

    public abstract void passDiagnostics() throws NullPointerException;

    public void stop(){

    }

    @Override
    public void pitStop() {
        System.out.println("Авто " + getBrand() + " " + getModel() + " на пит стопе");
    }

    @Override
    public void bestLapTime() {
        System.out.println("Лучшее время круга " + getBrand() + " " + getModel());
    }

    @Override
    public void maximumSpeed() {
        System.out.println("Максимальная скорость " + getBrand() + " " + getModel());
    }

    public String getBrand() {
        return brand;
    }

    public String getModel() {
        return model;
    }

    public double getEngineVolume() {
        return engineVolume;
    }

    public Mechanic getMechanic() {
        return mechanic;
    }

    public void setMechanic(Mechanic mechanic) {
        this.mechanic = mechanic;
    }
}
