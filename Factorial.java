package org.example;

public class Factorial {
    public static void main(String[] args) {
        int result = factorial(5);
        System.out.println("Factorial is: " + result);
    }
    public static int factorial(int n) {
        int result = 1;
        for (int i = 1; i <= n; i++) {
            result *= i;
        }
        return result;
    }
}
