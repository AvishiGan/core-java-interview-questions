package solid_principles.open_closed_principle.violation;

public class VehicleInfo {

    public double vehicleNumber(Vehicle vehicle) {

        if (vehicle instanceof Car) {
            return vehicle.getNumber();
        } else if (vehicle instanceof Bike) {
            return vehicle.getNumber();
        } else {
            return 0;
        }
    }
}
