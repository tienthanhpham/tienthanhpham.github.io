package vn.techmaster.account;

import java.text.NumberFormat;

public class SavingAccount extends Account {
    private final double MONTH_IN_YEAR = 12.0;
    private double annualInterest;

    public SavingAccount(String id, double balance, double annualInterest) {
        super(id, balance);
        this.annualInterest = annualInterest;
    }

    @Override
    public double monthlyInterest() {
        return getBalance() * annualInterest / MONTH_IN_YEAR;
    }

    public void widthDraw(double amount) {
        deduct(amount);
    }
}
