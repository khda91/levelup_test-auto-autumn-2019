package ru.level.qa.test.auto.autumn.java.oop;

public class Cat extends Animal implements Runnable {

    public Cat(String name) {
        super(name, "cat");
        voice = "МЯУ!";
    }

    @Override
    public void run() {
        System.out.println("cat "  + getName() + " run");
    }
}
