import java.util.Map;

public class Bus extends Vehicle {
    private Map<String, Double> ticketPrices;

    public Bus(int maxLoad, Map<String, Double> ticketPrices) {
        super(maxLoad);
        this.ticketPrices = ticketPrices;
    }

    @Override
    public String getRequiredLicenseCategory() {
        return "Category D";
    }

    @Override
    public String getRequiredPassengerCategory() {
        return "Adult";
    }

    // Other methods specific to Bus
}
