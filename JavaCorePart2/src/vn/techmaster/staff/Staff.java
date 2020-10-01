package vn.techmaster.staff;

public class Staff {
    StaffMember[] staffList = {
            new Volunteer("Thanh", "Techmaster", "So_01", "123456"),
            new Employee("Phuc", "Techmaster", "So_01", "123456", 500_000),
            new Executive("Cuong", "Techmaster", "So_01", "123456", 500_000, 100_000),
            new Hourly("Tung", "Techmaster", "So_01", "123456", 50_000)
    };

    public StaffMember[] getStaffList() {
        return staffList;
    }
}
