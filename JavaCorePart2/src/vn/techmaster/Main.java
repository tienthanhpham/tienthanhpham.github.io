package vn.techmaster;

import vn.techmaster.exceptions.ExceptionDemo;
import vn.techmaster.exceptions.ExceptionDemos2;

import java.io.IOException;

public class Main {

    public static void main(String[] args) {
	// write your code here
        //ExceptionDemo.show();
        try {
            ExceptionDemos2.show();
        } catch (Throwable e) {
            System.out.println("Co loi xay ra");
        }
    }
}
