package solid_principles.open_closed_principle.non_violation;

public abstract class Vehicle {

    protected double number;

    public Vehicle(double number) {
        setNumber(number);
    }

    public void setNumber(double number) {
        this.number = number;
    }

    abstract double getNumber();
}
