package transport;


import driver.Driver;
import driver.DriverB;
import driver.DriverLicenseException;

import java.util.ArrayList;

public class Car extends Transport <DriverB>{
    private BodyType bodyType;

    private Mechanic mechanic;
    public enum BodyType {SEDAN("Седан"),
        HATCHBACK("Хэтчбек"),
        COMPARTMENT("Купе"),
        UNIVERSAL("Универсал"),
        SUV("Внедорожник"),
        CROSSOVER("Кроссовер"),
        PICKUP("Пикап"),
        VAN("Фургон"),
        MINIVAN("Минивэн");

        private final String body;

        @Override
        public String toString() {
            return "Тип кузова: " + body;
        }

        BodyType(String body) {
            this.body = body;
        }

        public String getBody() {
            return body;
        }
    }
    @Override
    public void printType() {
        if (bodyType == null){
            System.out.println("Данных по транспортному средству недостаточно");
        } else {
            System.out.println(bodyType);
        }
    }
    @Override
    public void passDiagnostics() {
        System.out.println("Диагностика");
    }

    @Override
    public String toString() {
        return "Модель " + getBrand() + " " + getModel() + ", Объем двигателя - " + getEngineVolume() + ", " + getMechanic();
    }

    @Override
    public void start(Driver driver) throws DriverLicenseException {
        super.start(driver);
    }

    public Car(String brand, String model, double engineVolume, BodyType bodyType) {
        super(brand, model, engineVolume);
        this.bodyType = bodyType;
    }

    @Override
    public void addMechanic(Mechanic mechanic) {
        super.addMechanic(mechanic);
    }

    public BodyType getBodyType() {
        return bodyType;
    }

    public void setBodyType(BodyType bodyType) {
        this.bodyType = bodyType;
    }

    public Mechanic getMechanic() {
        return mechanic;
    }

    public void setMechanic(Mechanic mechanic) {
        this.mechanic = mechanic;
    }
}
