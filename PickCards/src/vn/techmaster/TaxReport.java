package vn.techmaster;

public class TaxReport {
    private TaxCalculator taxCalculator;

    public TaxReport() {
        taxCalculator = new TaxCalculator(100_000);
    }

    public void show() {
        var tax = taxCalculator.calculateTax();
        System.out.println(tax);
    }
}
