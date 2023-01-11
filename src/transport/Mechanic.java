package transport;

public class Mechanic {
    private String name;
    private String company;

    private CarCategory carCategory;

    public enum CarCategory {
        CAR, TRUCK, BUS;
    }

    @Override
    public String toString() {
        return "Имя механика " + getName();
    }

    public Mechanic(String name, CarCategory carCategory) {
        this.name = name;
        this.carCategory = carCategory;
    }

    public void performMaintenance(){

    }

    public void fixCar(){

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }
}
