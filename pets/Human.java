package org.example.pets;

import org.example.practice1_shelf.Shelf;

public class Human {
    private String name;

    public Human(String name) {
        this.name = name;
    }

    public void calltheCat(Cat cat) {
        cat.Answer();
    }
}
