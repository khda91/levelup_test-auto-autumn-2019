package ru.level.qa.test.auto.autumn.java.statics;

public class ConsoleWriter {

    public static final double PI = 3.1415;

    static String PREFIX = "PR - > ";

    private String outType;

    public ConsoleWriter() {
        this.outType = "console";
    }

    public ConsoleWriter(String outType) {
        this.outType = outType;
    }

    public static void printLine(String line) {
        System.out.println(line);
    }
}
