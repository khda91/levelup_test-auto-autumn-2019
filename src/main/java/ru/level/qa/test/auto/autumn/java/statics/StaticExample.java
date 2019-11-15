package ru.level.qa.test.auto.autumn.java.statics;

public class StaticExample {

    public static void main(String[] args) {
        ConsoleWriter.printLine("Line");
        System.out.println(ConsoleWriter.PREFIX);

        ConsoleWriter cw = new ConsoleWriter();
        cw.printLine("cw line");
        System.out.println(cw.PREFIX);

        ConsoleWriter cw1 = new ConsoleWriter("file");
        cw.PREFIX = "F - > ";

        System.out.println(ConsoleWriter.PREFIX);
        cw1.PREFIX = "CW - > ";
        System.out.println(ConsoleWriter.PREFIX);
        System.out.println(ConsoleWriter.PREFIX);

        System.out.println(ConsoleWriter.PI);

    }
}
