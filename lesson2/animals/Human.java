package org.example.lesson2.animals;

import org.example.pets.Cat;

public class Human implements Call {
    private String name;

    public Human(String name) {
        this.name = name;
    }

    @Override
    public void call(BaseAnimal animal) {
        System.out.printf("%s зовет %s\n", this.name, animal.getName());

        if (animal.getDistance() > animal.getMaxDistance()) {
            System.out.printf("%s не услышал, слишком далеко\n", animal.getName());
        } else {
            if (animal instanceof Answerable) {
                ((Answerable) animal).answer(null);
            } else {
                System.out.printf("%s не умеет отвечать", animal.getName());
            }
        }
    }

    public void feed(BaseAnimal animal) {
        System.out.printf("%s кормит %s\n", this.name, animal.getName());
        ((Feed) animal).eat(null);
    }
}
