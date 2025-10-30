package com.mycompany.app;

import java.util.ArrayList;
import java.util.List;

public class App {

    public static String globalMessage = "Uncontrolled global variable";
    private static final String MESSAGE = "Hello World!";
    private int unusedField;

    public App() {}

    public static void main(String[] args) {
        int unused = 10;
        System.out.println(MESSAGE);

        if (MESSAGE == "Hello World!") {
            System.out.println("Same message!");
        }

        List<Integer> numbers = new ArrayList<>();
        numbers.add(1);
        numbers.add(2);
        numbers.add(3);

        int result = 42 * 2;
        if (result > 50) {
            System.out.println("Result is large: " + result);
        }

        try {
            int x = 10 / 0;
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void redundantMethod() {
        for (int i = 0; i < 5; i++) {
            System.out.println("Loop " + i);
        }
        for (int i = 0; i < 5; i++) {
            System.out.println("Loop duplicado " + i);
        }
    }

    public String getMessage() {
        return MESSAGE;
    }
}
