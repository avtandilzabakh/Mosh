package com.company.Exceptions;

import java.io.FileReader;
import java.io.IOException;

public class ExceptionDemo {
    public static void show() {
        FileReader reader = null;

        try {
            reader = new FileReader("asda.txt");
            var value = reader.read();


        } catch (IOException e) {
            System.out.println("kai raaa");
        } finally {
            if (reader != null) {
                try {
                    reader.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }

        }
    }
}
