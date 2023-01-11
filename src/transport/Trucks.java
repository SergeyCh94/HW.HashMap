package transport;


import driver.Driver;
import driver.DriverC;
import driver.DriverLicenseException;

public class Trucks extends Transport <DriverC>{

    @Override
    public void printType() {
        if (loadCapacity == null){
            System.out.println("Данных по транспортному средству недостаточно");
        } else {
            System.out.println(loadCapacity);
        }
    }

    public enum LoadCapacity {
        N1(null, 3.5f), N2(3.5f, 12f), N3(12f, null);

        private final Float down;
        private final Float up;

        LoadCapacity(Float down, Float up) {
            this.down = down;
            this.up = up;
        }

        @Override
        public String toString() {
            if (down == null){
                return "Грузоподъемность до " + up + " тонн";
            } else  if (up == null) {
                return "Грузоподъемность от " + down;
            } else {
                return "Грузоподъемность от " + down + " тонн до " + up + " тонн";
            }
        }
    }

    private LoadCapacity loadCapacity;

    @Override
    public void passDiagnostics() {
        System.out.println("Диагностика");
    }

    @Override
    public void start(Driver driver) throws DriverLicenseException {
        super.start(driver);
    }

    @Override
    public String toString() {
        return "Модель " + getBrand() + " " + getModel() + ", Обьем двигателя - " + getEngineVolume();
    }

    public Trucks(String brand, String model, double engineVolume, LoadCapacity loadCapacity) {
        super(brand, model, engineVolume);
        this.loadCapacity = loadCapacity;
    }

    public LoadCapacity getLoadCapacity() {
        return loadCapacity;
    }

    public void setLoadCapacity(LoadCapacity loadCapacity) {
        this.loadCapacity = loadCapacity;
    }
}
