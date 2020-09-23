package vn.techmaster;

public class TaxReport {
    private TaxCalculator calculator;
    private double tax;

    public double getTax() {
        return tax;
    }

    public void setCalculator(TaxCalculator calculator) {
        this.calculator = calculator;
    }

    public TaxReport() {
        //this.calculator = calculator;
    }

    public double show(TaxCalculator calculator) {
        tax = calculator.calculateTax();
        return tax;
    }
}
