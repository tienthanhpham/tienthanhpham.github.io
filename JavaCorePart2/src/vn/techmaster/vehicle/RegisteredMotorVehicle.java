package vn.techmaster.vehicle;

public abstract class RegisteredMotorVehicle extends RegisteredVehicle {
    private int emptyWeight;
    private int lastOdometer;

    public RegisteredMotorVehicle(String tag,
                                  String registeredTo, String owner,
                                  int emptyWeight, int lastOdometer) {
        super(tag, registeredTo, owner);
        this.emptyWeight = emptyWeight;
        this.lastOdometer = lastOdometer;
    }

    @Override
    public void reRegister(String registeredTo, String owner, int lastOdometer) throws RegistrationException {
        if (this.lastOdometer > lastOdometer)
            throw new RegistrationException("So km khong hop le");
        super.setRegisteredTo(registeredTo);
        super.setOwner(owner);
        this.lastOdometer = lastOdometer;
    }

    public int getEmptyWeight() {
        return emptyWeight;
    }

    @Override
    public String printRegistration() {
        return super.printRegistration()
                + "\n" + "Empty weight: " + emptyWeight
                + "\t" + "Last odometer: " + lastOdometer;
    }

    @Override
    public abstract double getAnnualFee(String truckType);
}
