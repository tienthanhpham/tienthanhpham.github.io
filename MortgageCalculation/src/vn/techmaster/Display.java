package vn.techmaster;

public class Display {
    private MortgageCal mortgageCal;

    public Display(MortgageCal mortgageCal) {
        this.mortgageCal = mortgageCal;
    }

    public void printMortgage() {
        System.out.println("Monthly payment:" + mortgageCal.mortgageCal());
    }

    public void printBalance() {
        for (int month = 1; month <= mortgageCal.getPaymentPeriods(); month++)
            System.out.println("Balance after " + month + " month : " + mortgageCal.balanceCal(month));
    }
}
