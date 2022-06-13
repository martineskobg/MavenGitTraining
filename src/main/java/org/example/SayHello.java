package org.example;

public class SayHello {

    private String message;

    public SayHello(String message) {
        this.message = message;
    }

    public String printMessage() {
        System.out.println(message);
        return "Hello World";
    }

    public void prntMessage() {
        System.out.println(message);
        int divide = 10 / 0;
    }

    public static boolean isOdd(int number) {
        return number % 2 != 0;
    }

}
