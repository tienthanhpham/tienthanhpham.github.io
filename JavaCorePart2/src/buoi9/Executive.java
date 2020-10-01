package buoi9;

public class Executive extends Employee {
	private double allowanceRate;

	public Executive(String name, String address, String phone,
					 String insurance, double manRate, int workingDays, double allowanceRate) {
		super(name, address, phone, insurance, manRate, workingDays);
		this.allowanceRate = allowanceRate;
		// TODO Auto-generated constructor stub
	}

	@Override
	public int pay() {
		// TODO Auto-generated method stub
		return (int) (super.fixedSalary() * allowanceRate + super.pay());
	}

}


