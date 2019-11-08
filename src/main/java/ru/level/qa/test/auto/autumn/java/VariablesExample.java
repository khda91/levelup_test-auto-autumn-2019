package ru.level.qa.test.auto.autumn.java;

public class VariablesExample {

    int age = 10;
    int year;
    int month, day = 9;
    double averageRate = 88.8;
    double averageRate1;

    final double PI = 3.14;
    final String constString = new String("Number PI");

    public static void main(String[] args) {
        VariablesExample ve = new VariablesExample();
        System.out.println("age " + ve.age);
        System.out.println("year " + ve.year);
        System.out.println("average rate " + ve.averageRate);
        System.out.println("average rate 1 " + ve.averageRate1);

        // Final
        System.out.println("PI " + ve.PI);
//        ve.PI = 999.0;
        System.out.println("PI " + ve.PI);

        System.out.println("string: " + ve.constString);
//        ve.constString = "kjkjj";
        System.out.println("string: " + ve.constString.replace(" ", " some replace "));

        // преобаззовангие
        short valShort = 32000;
        double valDouble = valShort;
        System.out.println("short " + valShort);
        System.out.println("double " + valDouble);
        byte valByte = (byte) valDouble;
        System.out.println("byte " + valByte);

        // Обёртки
        Double doubleClass = 19.9;
        Double fromString = Double.valueOf("765.9");
        System.out.println("Value " + (fromString + doubleClass));
    }

}
