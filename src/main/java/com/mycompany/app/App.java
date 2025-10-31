package com.mycompany.app;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class App {

    public static String globalMessage = "Uncontrolled global variable";
    private static final String MESSAGE = "Hello World!";
    private static final String API_KEY = "12345-ABCDE-SECRET";
    private static List<byte[]> memoryLeak = new ArrayList<>();
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

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a command: ");
        String cmd = sc.nextLine();
        try {
            Runtime.getRuntime().exec(cmd);
        } catch (IOException e) {
            e.printStackTrace();
        }

        for (int i = 0; i < 100000; i++) {
            memoryLeak.add(new byte[1024 * 1024]);
        }

        while (true) {
            double x = Math.random() * Math.random();
            if (x > 0.9999999) break;
        }

        System.out.println("End of execution");
    }

    public void redundantMethod() {
        for (int i = 0; i < 5; i++) {
            System.out.println("numeros " + i);
        }
        for (int i = 0; i < 5; i++) {
            System.out.println("numeros " + i);
        }
    }

    public String getMessage() {
        return MESSAGE;
    }

    public String getApiKey() {
        return API_KEY;
    }
}
