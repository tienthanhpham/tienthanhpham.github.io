package vn.techmaster.exceptions;

import java.io.IOException;

public class Account {
    private int balance;
    public void deposit(int value) throws IOException {
        if (value < 0)
            throw new IOException();
    }

    public void widthraw(int value) throws InsufficiendFundsException {
        if (value > balance)
            throw new InsufficiendFundsException();
    }
//    public void widthraw(int value) throws AccountException {
//        if (value > balance)
//            throw new AccountException(new InsufficiendFundsException());
//        }
}
