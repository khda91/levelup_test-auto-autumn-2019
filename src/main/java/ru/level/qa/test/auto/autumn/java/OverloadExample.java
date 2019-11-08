package ru.level.qa.test.auto.autumn.java;

public class OverloadExample {

    public static void sum(int a, int b) {
        System.out.println(a + b);
    }

    public static void sum(double a, double b) {
        System.out.println(a + b);
    }

    public static void sum(int a, double b) {
        System.out.println(a + b);
    }

    public static void sum(double a, int b) {
        System.out.println(a + b);
    }

    public static void main(String[] args) {
        sum(1, 1);
        sum(1.0, 2.0);
        sum(1, 3.0);
        sum(5.0, 3);
    }
}
