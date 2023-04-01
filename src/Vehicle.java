import java.util.ArrayList;
import java.util.List;

public abstract class Vehicle {
    private int maxLoad;
    private List<Driver> drivers;
    private List<Passenger> passengers;

    public Vehicle(int maxLoad) {
        this.maxLoad = maxLoad;
        this.drivers = new ArrayList<>();
        this.passengers = new ArrayList<>();
    }

    public void addDriver(Driver driver) {
        if (drivers.size() < 1 && driver.getLicenseCategory().equals(getRequiredLicenseCategory())) {
            drivers.add(driver);
        }
    }

    public void addPassenger(Passenger passenger) {
        if (passengers.size() < maxLoad && passenger.getCategory().equals(getRequiredPassengerCategory())) {
            passengers.add(passenger);
        }
    }

    public abstract String getRequiredLicenseCategory();

    public abstract String getRequiredPassengerCategory();

    public int getMaxLoad() {
        return maxLoad;
    }

    public void setMaxLoad(int maxLoad) {
        this.maxLoad = maxLoad;
    }

    public List<Driver> getDrivers() {
        return drivers;
    }

    public void setDrivers(List<Driver> drivers) {
        this.drivers = drivers;
    }

    public List<Passenger> getPassengers() {
        return passengers;
    }

    public void setPassengers(List<Passenger> passengers) {
        this.passengers = passengers;
    }
}
