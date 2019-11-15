package ru.level.qa.test.auto.autumn.java.oop;

public final class Dog extends Animal implements Swimmable, Runnable {

    private static final String VOICE = "ГАВ!";

    private String keeper;
    private String breed;
    private boolean sex;

    public Dog(String name) {
        super(name, "dog");
        this.voice = "ГАВ!";
    }

    public Dog(String name, double weight) {
        super(name, "dog");
        this.weight = weight;
    }

    public String getKeeper() {
        return keeper;
    }

    public void setKeeper(String keeper) {
        this.keeper = keeper;
    }

    public String getBreed() {
        return breed;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }

    public boolean isSex() {
        return sex;
    }

    public void setSex(boolean sex) {
        this.sex = sex;
    }

    @Override
    public void swim() {
        System.out.println("dog " + getName() + " swim");
    }

    @Override
    public void run() {
        System.out.println("dog " + getName() + " run");
    }
}
