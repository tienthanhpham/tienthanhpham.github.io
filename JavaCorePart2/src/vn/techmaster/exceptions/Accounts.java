package vn.techmaster.exceptions;

import java.io.IOException;

public class Accounts {
    public void deposit(double value) throws IOException {
        if (value < 0)
            throw new IOException();
    }
}
