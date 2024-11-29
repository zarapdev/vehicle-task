public class Main {
    public static void main(String[] args) {

        VehicleService vehicleService = new VehicleServiceHandler();
        vehicleService.addVehicle(new Car("Toyota" , "R4" ,2024, 5));
        vehicleService.addVehicle(new MotorBike("BMW" , "S8" , 2024 , "sport" ));
        vehicleService.getAllVehicles();
    }
}
