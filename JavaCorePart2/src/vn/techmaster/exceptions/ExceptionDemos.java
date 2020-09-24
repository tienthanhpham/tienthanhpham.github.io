package vn.techmaster.exceptions;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;

public class ExceptionDemos {
    public static void show() {
        try (
            var reader = new FileReader("file.txt");
            var writer = new FileWriter("");
        ) {
            var value = reader.read();
        } catch (IOException ex) {
            System.out.println("Khong the doc duoc file");
        }
    }
}
