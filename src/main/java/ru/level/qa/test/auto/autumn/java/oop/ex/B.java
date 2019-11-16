package ru.level.qa.test.auto.autumn.java.oop.ex;

class B extends A {

    public String variable = defineVariable();

    public B() {
        super();
        System.out.println(variable);
        text();
    }

    @Override
    public String defineVariable() {
        return "class B variable";
    }

    public static void text() {
        System.out.println("class B text method");
    }

}