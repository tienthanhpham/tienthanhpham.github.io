package vn.techmaster.staff;

public abstract class StaffMember {
    private String name;
    private String address;
    private String socialID;
    private String phone;

    public StaffMember(String name, String address, String socialID, String phone) {
        this.name = name;
        this.address = address;
        socialID = socialID;
        this.phone = phone;
    }

    public abstract double payday(int day);

    @Override
    public String toString() {
        return "Name: " + name
                + "\taddress: " + address
                + "\tSocial ID: " + socialID
                + "\tPhone: " + phone;
    }
}
