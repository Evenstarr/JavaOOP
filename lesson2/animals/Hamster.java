package org.example.lesson2.animals;

public class Hamster extends BaseAnimal implements Feed {
    public Hamster(String name, int age, String color, int distance, int maxDistance) {
        super(name, age, color, distance, maxDistance);
    }

    @Override
    public void eat(BaseAnimal animal) {
        System.out.printf("%s хомяк ест\n", getName());
    }
}
