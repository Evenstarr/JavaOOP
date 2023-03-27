package org.example.lesson2.animals;

public class Dog extends BaseAnimal implements Feed, Answerable {
    public Dog(String name, int age, String color, int distance, int maxDistance) {
        super(name, age, color, distance, maxDistance);
    }

    @Override
    public void answer(BaseAnimal animal) {
        System.out.println("Собака лает\n");
    }

    @Override
    public void eat(BaseAnimal animal) {
        System.out.printf("%s Собака ест\n", getName());
    }
}
