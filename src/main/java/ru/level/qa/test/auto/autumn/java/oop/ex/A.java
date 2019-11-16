package ru.level.qa.test.auto.autumn.java.oop.ex;

public class A {

    public String variable = defineVariable();

    public A() {
        System.out.println(variable);
        text();
    }

    public String defineVariable() {
        return "class A variable";
    }

    public static void text() {
        System.out.println("class A text method");
    }
}
