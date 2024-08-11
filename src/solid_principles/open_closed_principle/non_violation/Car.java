package solid_principles.open_closed_principle.non_violation;

import solid_principles.open_closed_principle.violation.Vehicle;

public class Car extends Vehicle {

    private double number;

    public Car(double number) {
        super(number);
    }
}
