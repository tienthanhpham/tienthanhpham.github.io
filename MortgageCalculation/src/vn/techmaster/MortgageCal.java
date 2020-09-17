package vn.techmaster;

public class MortgageCal {
    private final byte MONTHS_IN_YEAR = 12;
    private final byte PERCENT = 100;
    private double principal;
    private float monthlyRate;
    private int paymentPeriods;

    public MortgageCal(double principal, float annuallyRate, int years) {
        this.principal = principal;
        this.monthlyRate = annuallyRate / MONTHS_IN_YEAR / PERCENT;
        this.paymentPeriods = years * MONTHS_IN_YEAR;

    }

    public double mortgageCal() {
        return principal * monthlyRate * Math.pow(1 + monthlyRate, paymentPeriods)
                / (Math.pow(1 + monthlyRate, paymentPeriods) - 1);
    }

    public double balanceCal(int numberOfPaymentMade) {
        return principal
                * (Math.pow(1 + monthlyRate, paymentPeriods)
                    - Math.pow(1 + monthlyRate, numberOfPaymentMade))
                / (Math.pow(1 + monthlyRate, paymentPeriods) - 1);
    }

    public int getPaymentPeriods() {
        return paymentPeriods;
    }
}
