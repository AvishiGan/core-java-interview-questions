package solid_principles.open_closed_principle.non_violation;

import solid_principles.open_closed_principle.violation.Vehicle;

public class Bike extends Vehicle {

    private double number;

    public Bike(double number) {
        super(number);
    }
}
