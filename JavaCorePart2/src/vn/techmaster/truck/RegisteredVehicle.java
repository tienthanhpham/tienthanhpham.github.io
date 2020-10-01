package vn.techmaster.truck;

public abstract class RegisteredVehicle {
    private String tag;
    private String registeredTo;
    private String owner;

    public RegisteredVehicle(String tag, String registeredTo, String owner) {
        this.tag = tag;
        this.registeredTo = registeredTo;
        this.owner = owner;
    }

    public void reRegister(String registeredTo, String owner, int lastOdometer) throws RegistrationException {
        this.registeredTo = registeredTo;
        this.owner = owner;
    }

    public void printRegistration() {
        System.out.println(tag + "\t" + registeredTo + "\t" + owner);
    }

    public abstract double getAnnualFee(String truckType);

    public abstract String getTruckType();
}
