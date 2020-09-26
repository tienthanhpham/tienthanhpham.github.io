package vn.techmaster.tax;

public class TaxImplement {
    TaxCalculator tax2018 = new TaxCalculator2018();
    TaxCalculator tax2019 = new TaxCalculator2019();

    TaxReport taxReport = new TaxReport(tax2018);
}
