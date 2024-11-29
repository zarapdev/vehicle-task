public class Car extends Vehicle {
    private int seats;

    public int getSeats() {
        return seats;
    }

    public void setSeats(int seats) {
        this.seats = seats;
    }

    public Car(String brand, String model, int year, int seats) {
        super(brand, model, year);
        this.seats = seats;
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("seats " + seats);
    }
}