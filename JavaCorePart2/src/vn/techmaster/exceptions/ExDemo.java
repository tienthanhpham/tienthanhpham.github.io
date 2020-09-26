package vn.techmaster.exceptions;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class ExDemo {
    public static void show() {
        try (
            var reader = new FileReader("file.txt");
            var writer = new FileWriter("...");
        ) {
            var value = reader.read();
        }
        catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    public static void sayHello(String name) {
        System.out.println("Hello " + name.toUpperCase());
    }
}
