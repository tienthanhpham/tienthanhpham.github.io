package buoi9;

public class Staff {
	private  StaffMember[] staffList = {
			new Volunteer("Phuc", "Ung hoa", "123-456", "111", 0, 22),
			new Hourly("nam", "Ha noi", "123-452", "112", 50, 80),
			new Executive("nghia", "Ha dong", "112-222", "111", 500_000, 22, 0.1),
			new Employee("helo", "hai phong", "1223-123", "122", 500_000, 22)};

	public void payDay() {
		staffList[2].setAward(1000_000);
		for(int i = 0; i < staffList.length; i++) {
			System.out.println(staffList[i].toString() + "\n");
		}
	}

	public void printPayDay() {
		staffList[2].setAward(1000_000);
		for (StaffMember staff : staffList)
			System.out.println(staff.toString() + "\n");
	}
}
