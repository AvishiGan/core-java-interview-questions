package solid_principles.open_closed_principle.violation;

public class Vehicle {

    private double number;

    public Vehicle(double number) {
        setNumber(number);
    }

    public double getNumber() {
        return number;
    }

    public void setNumber(double number) {
        this.number = number;
    }
}
