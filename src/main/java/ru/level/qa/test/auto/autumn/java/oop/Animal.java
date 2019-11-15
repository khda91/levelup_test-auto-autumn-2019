package ru.level.qa.test.auto.autumn.java.oop;

public abstract class Animal {

    private String name;
    private String type;
    protected String voice;
    protected double weight;
    private double height;
    private int age;

    protected Animal(String name, String type) {
        this.name = name;
        this.type = type;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public int getAge() {
        return age;
    }

    public final void setAge(int age) {
        this.age = age;
    }

    public void say() {
        System.out.println(type + " " + name + " says " + voice);
    }
}
