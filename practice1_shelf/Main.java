package org.example.practice1_shelf;

public class Main {
    public static void main(String[] args) {
        Human vasya = new Human("Вася", 10);
        Shelf shelf = new Shelf("Шкаф1", 10, 10);
        System.out.println(vasya.putThings(shelf, 10));

        Shelf shelf1 = new Shelf("Шкаф2", 10, 100);
        System.out.println(vasya.putThings(shelf1, 10));
        System.out.println(vasya.getThings(shelf1, 5));
    }
}
