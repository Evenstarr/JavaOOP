package org.example.practice1_shelf;

import org.example.practice1_family.Person;

public class Human {
    private String name;

    public Human(String name, int things) {
        this.name = name;
    }

    public Human(String name) {
        this(name, 0);
    }

    public Human() {
        this("Human");
    }

    public String putThings(Shelf shelf, int things) {
        return shelf.putThings(things);
    }

    public String getThings(Shelf shelf, int things) {
        return  shelf.getThings(things);
    }
}
