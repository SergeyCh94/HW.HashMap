package transport;


import driver.DriverD;

public class Bus extends Transport <DriverD> {

    @Override
    public void printType() {
        if (typeOfCapacity == null){
            System.out.println("Данных по транспортному средству недостаточно");
        } else {
            System.out.println(typeOfCapacity);
        }
    }

    @Override
    public void passDiagnostics() throws NullPointerException {
            throw new UnsupportedOperationException("Автобусы не могут проходить диагностику");
    }

    public enum TypeOfCapacity {
        ESPECIALLY_SMALL(null, 10),
        SMALL(null, 25),
        AVERAGE(40, 50),
        BIG(60, 80),
        ESPECIALLY_BIG(100, 120);

        private final Integer down;
        private final Integer up;

        TypeOfCapacity(Integer down, Integer up) {
            this.down = down;
            this.up = up;
        }

        @Override
        public String toString() {
            if (down == null){
                return "Вместимость: до " + up + " мест";
            } else if (up == null) {
                return "Вместимость: не более " + down + " мест";
            } else {
                return "Вместимость: " + down + " - " + up + " мест";
            }
        }
    }

    public Bus(String brand, String model, double engineVolume, TypeOfCapacity typeOfCapacity) {
        super(brand, model, engineVolume);
        this.typeOfCapacity = typeOfCapacity;
    }

    private TypeOfCapacity typeOfCapacity;
}