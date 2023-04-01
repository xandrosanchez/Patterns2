import java.util.Map;

public class VehicleBuilder {
    private int maxLoad;
    private boolean isTaxi;
    private boolean requiresChildSeat;
    private Map<String, Double> ticketPrices;

    public VehicleBuilder setMaxLoad(int maxLoad) {
        this.maxLoad = maxLoad;
        return this;
    }

    public VehicleBuilder setIsTaxi(boolean isTaxi) {
        this.isTaxi = isTaxi;
        return this;
    }

    public VehicleBuilder setRequiresChildSeat(boolean requiresChildSeat) {
        this.requiresChildSeat = requiresChildSeat;
        return this;
    }

    public VehicleBuilder setTicketPrices(Map<String, Double> ticketPrices) {
        this.ticketPrices = ticketPrices;
        return this;
    }

    public Vehicle build() {
        if (isTaxi) {
            return new Taxi(maxLoad, requiresChildSeat);
        } else {
            return new Bus(maxLoad, ticketPrices);
        }
    }
}
