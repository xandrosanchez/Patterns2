public class Taxi extends Vehicle {
    private boolean requiresChildSeat;

    public Taxi(int maxLoad, boolean requiresChildSeat) {
        super(maxLoad);
        this.requiresChildSeat = requiresChildSeat;
    }

    @Override
    public String getRequiredLicenseCategory() {
        return "Category B";
    }

    @Override
    public String getRequiredPassengerCategory() {
        return "Adult";
    }

    public boolean isRequiresChildSeat() {
        return requiresChildSeat;
    }

    public void setRequiresChildSeat(boolean requiresChildSeat) {
        this.requiresChildSeat = requiresChildSeat;
    }
}
