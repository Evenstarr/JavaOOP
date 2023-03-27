package org.example.lesson2.animals;

import java.util.Random;

public abstract class BaseAnimal {
    private String name;
    private int age;
    private String color;

    private int distance;
    private int maxDistance;

    private static Random r;

    public BaseAnimal(String name, int age, String color, int distance, int maxDistance) {
        this.name = name;
        this.age = age;
        this.color = color;
        this.distance = distance;
        this.maxDistance = maxDistance;
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

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getDistance() {
        return distance;
    }

    public void setDistance(int distance) {
        this.distance = distance;
    }

    public int getMaxDistance() {
        return maxDistance;
    }

    public void setMaxDistance(int maxDistance) {
        this.maxDistance = maxDistance;
    }

    public void Go() {
        r = new Random();
        int dist = r.nextInt(-100, 200);
        System.out.printf("%s двигается на %d метров", this.getName(), dist);
        System.out.println();
        this.distance += dist;
    }
}
