package vn.techmaster.staff;

public class Executive extends Employee {
    private double allowance;

    public Executive(String name, String address, String socialID, String phone, double dailyRate, double allowance) {
        super(name, address, socialID, phone, dailyRate);
        this.allowance = allowance;
    }

    @Override
    public double payday(int day) {
        return super.payday(day) + allowance + getAward();
    }

    @Override
    public String toString() {
        return super.toString() + "\tAllowance: " + allowance;
    }
}
