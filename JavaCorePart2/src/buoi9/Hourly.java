package buoi9;

public class Hourly extends StaffMember {
	
	public Hourly(String name, String address, String phone, String insurance, double manRate, int workingDays) {
		super(name, address, phone, insurance, manRate, workingDays);
	}
	
	@Override
	public int pay() {
		// TODO Auto-generated method stub
		return (int) (getManRate() * getWorkingDays());
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "Name: " + getName() + "\n" 
				+ "address: " + getAddress() + "\n"
				+ "phone: " + getPhone() + "\n"
				+ "insurance: " +getInsurance()  + "\n"
				+ "hour: " + getWorkingDays() + " \n"
				+  "income: " + pay();
	}
}
