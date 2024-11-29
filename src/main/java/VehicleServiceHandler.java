import java.util.HashSet;

public class VehicleServiceHandler implements VehicleService{
    HashSet<Vehicle> vehicles = new HashSet<>();

    @Override
    public void addVehicle(Vehicle vehicle) {
        vehicles.add(vehicle);
    }

    @Override
    public void getAllVehicles() {

        for (Vehicle vehicle : vehicles){
            vehicle.displayInfo();
        }

    }
}
