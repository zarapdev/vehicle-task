public class MotorBike extends Vehicle {
    private String type;

    public MotorBike(String brand, String model, int year, String type) {
        super(brand, model, year);
        this.type = type;
    }


    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("type " + type) ;
    }
}