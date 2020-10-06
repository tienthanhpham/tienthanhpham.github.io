package vn.techmaster.vehicle;

public abstract class RegisteredVehicle {
    private String tag;
    private String registeredTo;//address1
    private String owner;

    public RegisteredVehicle() {
    }

    public RegisteredVehicle(String tag, String registeredTo, String owner) {
        this.tag = tag;
        this.registeredTo = registeredTo;
        this.owner = owner;
    }

    public abstract void reRegister(String registeredTo, String owner, int lastOdometer)
            throws RegistrationException;

    public String printRegistration() {
        return "Tag: " + tag + "\t" + registeredTo + "\t" + owner;
    }

    public abstract double getAnnualFee(String truckType);

    public void setRegisteredTo(String registeredTo) {
        this.registeredTo = registeredTo;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }
}
