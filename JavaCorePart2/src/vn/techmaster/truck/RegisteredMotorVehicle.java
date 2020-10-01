package vn.techmaster.truck;

public class RegisteredMotorVehicle extends RegisteredVehicle {
    private int emptyWeight;
    private int lastOdometer;
    public RegisteredMotorVehicle(String tag, String registeredTo, String owner, int emptyWeight, int lastOdometer) {
        super(tag, registeredTo, owner);
        this.emptyWeight = emptyWeight;
        this.lastOdometer = lastOdometer;
    }

    @Override
    public void reRegister(String registeredTo, String owner, int lastOdometer) throws RegistrationException {
        if (this.lastOdometer > lastOdometer)
            throw new RegistrationException("So km khong hop le");
        super.reRegister(registeredTo, owner, lastOdometer);
    }

    @Override
    public void printRegistration() {
        super.printRegistration();
        System.out.println(emptyWeight + "\t" + lastOdometer);
    }

    @Override
    public double getAnnualFee(String truckType) {
        return 0;
    }

    @Override
    public String getTruckType() {
        return null;
    }

    public int getEmptyWeight() {
        return emptyWeight;
    }
}
