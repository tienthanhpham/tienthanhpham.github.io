package buoi9;

public class Employee extends StaffMember{
	private int award;

	public Employee(String name, String address, String phone, String insurance, double manRate, int workingDays) {
		super(name, address, phone, insurance, manRate, workingDays);
		// TODO Auto-generated constructor stub
	}
	
	
	@Override
	public int pay() {
		// TODO Auto-generated method stub
		return (int) getManRate() * getWorkingDays() + award;
	}

	public int fixedSalary() {
		return (int) (getManRate() * getWorkingDays());
	}

	public void setAward(int award) {
		this.award = award;
	}
}
