package vn.techmaster.staff;

public class Volunteer extends StaffMember {
    public Volunteer(String name, String address, String socialID, String phone) {
        super(name, address, socialID, phone);
    }

    @Override
    public double payday(int day) {
        return 0;
    }
}
