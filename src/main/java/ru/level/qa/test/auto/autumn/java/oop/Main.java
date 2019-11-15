package ru.level.qa.test.auto.autumn.java.oop;

public class Main {

    public static void main(String[] args) {
        Dog larry = new Dog("larry");
        Dog dog = new Dog("dog");
        Dog sharik = new Dog("sharik");
        Dog bobik = new Dog("bobik");

        Fish nemo = new Fish("nemo");
        Fish flanders = new Fish("flanders");
        Fish dorry = new Fish("dorry");

        Cat pushok = new Cat("pushok");
        Cat murka = new Cat("murka");
        Cat barsik = new Cat("barsik");
        Cat gav = new Cat("gav");
        Cat tom = new Cat("tom");

        Swimmable[] swimmingAnimals = { larry, dog, sharik, bobik, nemo, flanders, dorry };
        Runnable[] runningAnimals = { larry, dog, sharik, bobik, pushok, murka, barsik, gav, tom };
        Animal[] animals = { larry, dog, sharik, bobik, pushok, nemo, flanders, dorry, murka, barsik, gav, tom };

        for (Swimmable sa : swimmingAnimals) {
            sa.swim();
        }

        for (Runnable ra : runningAnimals) {
            ra.run();
        }

        for (Animal a : animals) {
            a.say();
        }
    }
}
