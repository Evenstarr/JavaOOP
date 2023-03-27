package org.example.lesson2.animals;

import java.util.Random;

/**
 * Котик слышит человека на расстоянии maxDistance. Он может ходить. Если уйдет за расстояние, то человека не услышит
 */
public class Cat extends BaseAnimal implements Feed, Answerable {
    public Cat(String name, int age, String color, int distance, int maxDistance) {
        super(name, age, color, distance, maxDistance);
    }

    @Override
    public void answer(BaseAnimal animal) {
        System.out.println("Котик говорит Мяу");
    }

    @Override
    public void eat(BaseAnimal animal) {
        System.out.printf("%s Котик ест\n", getName());
    }
}
