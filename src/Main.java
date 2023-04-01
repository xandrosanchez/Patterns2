import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {

        Vehicle taxi = new VehicleBuilder()
                .setMaxLoad(4)
                .setIsTaxi(true)
                .setRequiresChildSeat(true)
                .build();

        Driver driver1 = new Driver("John", "Category B");

        Passenger passenger1 = new Passenger("Alice", 30, "Adult");
        Passenger passenger2 = new Passenger("Bob", 25, "Adult");
        Passenger passenger3 = new Passenger("Charlie", 5, "Child");
        Passenger passenger4 = new Passenger("Dave", 10, "Child");

        taxi.addDriver(driver1);
        taxi.addPassenger(passenger1);
        taxi.addPassenger(passenger2);
        taxi.addPassenger(passenger3);
        taxi.addPassenger(passenger4); // This passenger will not be added due to max load limit
    }
}

