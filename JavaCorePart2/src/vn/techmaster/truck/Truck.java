package vn.techmaster.truck;

public class Truck extends RegisteredMotorVehicle {
    private String truckType;

    public Truck(String tag, String registeredTo, String owner, int emptyWeight, int lastOdometer, String truckType) {
        super(tag, registeredTo, owner, emptyWeight, lastOdometer);
        this.truckType = truckType;
    }

    @Override
    public void printRegistration() {
        super.printRegistration();
        System.out.println(truckType);
    }

    @Override
    public double getAnnualFee(String truckType) {
        switch (truckType) {
            case "BANTAI": return getEmptyWeight() * 0.05;
            case "CAMNHONG": return getEmptyWeight() * 0.01;
            default: return getEmptyWeight() * 0.1;
        }
    }

    @Override
    public String getTruckType() {
        return truckType;
    }
}
