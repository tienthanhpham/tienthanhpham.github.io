package vn.techmaster.staff;

public class Employee extends StaffMember {
    private double dailyRate;
    private double award;

    public Employee(String name, String address, String socialID, String phone, double dailyRate) {
        super(name, address, socialID, phone);
        this.dailyRate = dailyRate;
    }

    @Override
    public double payday(int day) {
        return dailyRate * day + award;
    }

    public void setAward(double award) {
        this.award = award;
    }

    public double getDailyRate() {
        return dailyRate;
    }

    public double getAward() {
        return award;
    }

    @Override
    public String toString() {
        return super.toString() + "\tDaily Rate: " + dailyRate;
    }
}
