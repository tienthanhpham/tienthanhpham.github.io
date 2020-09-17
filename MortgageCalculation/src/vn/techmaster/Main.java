package vn.techmaster;

public class Main {

    public static void main(String[] args) {
	// write your code here
        double principal = Input.readInput
                ("Nhap vao so tien goc: ", 1000, 1000_000,
                        "So tien goc phai tu " + 1000 + " đến " + 1000_000);
        float annuallyRate = (float) Input.readInput
                ("Nhap vao lai suat: ", 0, 30,
                        "Lai suat phai tu " + 0 + " đến " + 30);
        int years = (int) Input.readInput
                ("Nhap vao ky han: ", 0, 30,
                        "Ky han phai tu " + 0 + " đến " + 30);
        var mortgageInstance = new MortgageCal(principal, annuallyRate, years);
        var display = new Display(mortgageInstance);
        display.printMortgage();
        display.printBalance();
    }


}
