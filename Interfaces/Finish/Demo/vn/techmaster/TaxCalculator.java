package vn.techmaster;

public interface TaxCalculator {
  double calculateTax();

  static double getTaxabaleIncome(double income, double expenses) {
    return income - expenses;
  }
}
