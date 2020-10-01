package vn.techmaster.staff;

public class Firm {
    public static void implement() {
        var staffs = new Staff();
        for (StaffMember staff: staffs.getStaffList())
            System.out.println(staff);
    }
}
