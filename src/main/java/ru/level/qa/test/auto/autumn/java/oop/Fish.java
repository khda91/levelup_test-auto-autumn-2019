package ru.level.qa.test.auto.autumn.java.oop;

public class Fish extends Animal implements Swimmable {

    private String color;
    private boolean seaAreaType; // морская|пресноводная

    public Fish(String name) {
        super(name, "fish");
        this.voice = "БУЛЬ-БУЛЬ!";
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public boolean isSeaAreaType() {
        return seaAreaType;
    }

    public void setSeaAreaType(boolean seaAreaType) {
        this.seaAreaType = seaAreaType;
    }

    @Override
    public void swim() {
        System.out.println("fish " + getName() + " swim");
    }
}
