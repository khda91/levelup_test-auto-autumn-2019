package ru.level.qa.test.auto.autumn.java.collections;

import java.util.Objects;

public class Horse {//implements Comparable<Horse> {

    private String name;
    private String breed;
    private int maxSpeed;

    public Horse(String name, String breed, int maxSpeed) {
        this.name = name;
        this.breed = breed;
        this.maxSpeed = maxSpeed;
    }

    public String getName() {
        return name;
    }

    public String getBreed() {
        return breed;
    }

    public int getMaxSpeed() {
        return maxSpeed;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }

        Horse horse = (Horse) o;
        return maxSpeed == horse.maxSpeed &&
                Objects.equals(name, horse.name) &&
                Objects.equals(breed, horse.breed);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, breed, maxSpeed);
    }

    @Override
    public String toString() {
        return "Horse{" +
                "name='" + name + '\'' +
                ", breed='" + breed + '\'' +
                ", maxSpeed=" + maxSpeed +
                '}';
    }

//    @Override
//    public int compareTo(Horse o) {
//        if (maxSpeed > o.maxSpeed
//                && name.equals(o.name)) {
//            return 1;
//        }
//
//        if (maxSpeed < o.maxSpeed
//                && name.equals(o.name)) {
//            return -1;
//        }
//
//        return 0;
//    }
}
