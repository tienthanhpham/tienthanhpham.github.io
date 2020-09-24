package vn.techmaster.exceptions;

public class InsufficiendFundsException extends Exception {
    public InsufficiendFundsException(String mess) {
        super(mess);
    }

    public InsufficiendFundsException() {
        super("Khong du tien trong account");
    }
}
