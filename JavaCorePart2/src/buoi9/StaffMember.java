package buoi9;

public abstract class StaffMember {
	private String name;
	private String address;
	private String phone;
	private String insurance;
	private double manRate;
	private int workingDays;

	public StaffMember(String name, String address, String phone, String insurance, double manRate, int workingDays) {
		this.name = name;
		this.address = address;
		this.phone = phone;
		this.insurance = insurance;
		this.manRate = manRate;
		this.workingDays = workingDays;
	}

	public String getName() {
		return name;
	}

	public String getAddress() {
		return address;
	}

	public String getPhone() {
		return phone;
	}

	public String getInsurance() {
		return insurance;
	}

	public double getManRate() {
		return manRate;
	}

	public int getWorkingDays() {
		return workingDays;
	}

	public abstract int pay();
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "Name: " + name + "\n" 
				+ "address: " + address + "\n"
				+ "phone: " + phone + "\n"
				+ "insurance: " + insurance + "\n"
				+  "salary: " + pay();
	}

	public void setAward(int award) {
	}

}
