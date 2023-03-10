package org.example.practice1_shelf;

import org.example.lecture1.Robot3;

public class Shelf {
    enum State {
        Open, Closed
    }

    private int things;
    private int maxThings;

    private String name;

    private State state;

    public Shelf(String name, int things, int maxThings) {
        this.name = "Шкаф";
        this.state = State.Closed;
        this.things = things;
        this.maxThings = maxThings;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return String.format("Шкаф %s, вещей %d из %d, состояние - %s", this.name, this.things, this.maxThings, this.state);
    }

    public String getThings(int things) {
        if (this.state == State.Closed) {
            System.out.println("Шкаф закрыт, открываем");
            this.state = State.Open;
        }
        System.out.println();
        return getThingsFromShelf(things);
    }

    public String putThings(int things) {
        if (this.state == State.Closed) {
            System.out.println("Шкаф закрыт, открываем");
            this.state = State.Open;
        }
        System.out.println();
        return putThingsToShelf(things);
    }

    private String getThingsFromShelf (int things) {
        String returnString = "";
        if (things > this.things) {
            System.out.println("В шкафу %d вещей, а вы хотите взять %d, значит, возьмем, сколько есть");
            this.things = 0;
            returnString = String.format("Взяли %d, осталось 0", this.things);
        } else {
            this.things = this.things - things;
            returnString = String.format("Взяли %d, осталось %d", things, this.things);
        }
        System.out.println("Закрыли шкаф");
        this.state = State.Closed;
        return returnString;
    }

    public String putThingsToShelf(int things) {
        String returnString = "";
        if (things + this.things > this.maxThings) {
            returnString = "В шкаф не поместится столько вещей";
        } else {
            this.things = things + this.things;
            returnString = String.format("Положили %d, стало %d", things, this.things);
        }
        System.out.println("Закрыли шкаф");
        this.state = State.Closed;
        return returnString;
    }
}