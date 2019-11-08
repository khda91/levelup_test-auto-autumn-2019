package ru.level.qa.test.auto.autumn.java;

public class ConditionalOperatorsExample {

    enum TestType {
        WIP, RFA, APPROVED;
    }

    public static void main(String[] args) {
//        switchInt(1);
//        switchInt(2);
//        switchInt(3);
//        switchInt(4);


//        switchString("a");
//        switchString("b");
//        switchString("d");
//        switchString("f");
//        switchString("e");

        switchEnum(TestType.WIP);
    }

    public static void switchInt(int value) {
        switch (value) {
            case 1:
                System.out.println(value);
                break;
            case 2:
                System.out.println(value);
                break;
            case 3:
                System.out.println(value);
                break;
            case 4:
                System.out.println(value);
                break;
            case 5:
                System.out.println(value);
                System.out.println("a");
                break;
        }
    }

    public static void switchString(String value) {
        switch (value) {
            case "a":
                System.out.println(value);
                break;
            case "b":
                System.out.println(value);
                break;
            case "c":
                System.out.println(value);
                break;
            case "d":
                System.out.println(value);
                break;
            case "e":
            case "f":
                System.out.println(value);
                break;
        }
    }

    public static void switchEnum(TestType value) {
        switch (value) {
            case WIP:
                System.out.println(value);
                break;
            case RFA:
                System.out.println(value);
                break;
            case APPROVED:
                System.out.println(value);
                break;
        }
    }
}
