package vn.techmaster.account;

public class CurrentAccount extends Account {
    private double charge;

    public CurrentAccount(String id, double balance, double charge) {
        super(id, balance);
        this.charge = charge;
    }

    public void clearCheck(double amount) {
        if (getBalance() < amount)
            throw new IllegalArgumentException("So du khong du");
        deduct(amount + charge);
    }

    @Override
    public double monthlyInterest() {
        return 0;
    }
}
