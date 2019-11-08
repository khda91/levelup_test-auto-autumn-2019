package ru.level.qa.test.auto.autumn.java.constuctors;

public class Human {

    private String name;
    private int age;
    private double weight;
    private String email;
    private String address;

    public Human() {
    }

    public Human(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public Human(String name, int age, String email) {
        this(name, age);
        this.email = email;
    }

    public Human(String name, int age, String address, double weight) {
//        this.name = name;
//        this.age = age;
        this(name, age);
        this.address = address;
        this.weight = weight;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
}
