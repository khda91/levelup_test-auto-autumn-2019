package ru.level.qa.test.auto.autumn.java.constuctors;

public class HumanMain {

    public static void main(String[] args) {
        Human vasya = new Human("Vasya", 20, "vasya@ya.ru");
        Human petya = new Human("Petya", 20, "vasya@ya.ru", 68.900);


        System.out.println(vasya.getName());

    }

}
