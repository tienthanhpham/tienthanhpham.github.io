package vn.techmaster.staff;

public class Hourly extends StaffMember {
    private double hourlyRate;

    public Hourly(String name, String address, String socialID, String phone, double hourlyRate) {
        super(name, address, socialID, phone);
        this.hourlyRate = hourlyRate;
    }

    @Override
    public double payday(int day) {
        return 0;
    }

    @Override
    public String toString() {
        return super.toString() + "\tHourly Rate: " + hourlyRate;
    }
}
