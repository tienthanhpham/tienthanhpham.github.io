package vn.techmaster.exceptions;

import java.io.IOException;

public class ExceptionDemos2 {
    public static void show() throws IOException {
        var account = new Account();
        try {
            account.deposit(1);

        } catch (IOException e) {
            System.out.println("");
            throw e;
        }

    }
}
